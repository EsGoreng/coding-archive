<?php
include "controller.php";
?>
<!DOCTYPE html>
<html lang="id">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Mahasiswa (MVC)</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
            background-color: #f4f7f6;
            color: #333;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #004a99;
            margin-bottom: 30px;
            font-weight: 600;
        }

        .card-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 25px;
            max-width: 1200px;
            margin: 0 auto;
        }

        .student-card {
            background-color: #ffffff;
            border-radius: 12px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.08);
            width: 300px;
            overflow: hidden;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .student-card:hover {
            transform: translateY(-8px);
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.12);
        }

        .card-image {
            height: 280px;
            width: 100%;
            background-color: #e9ecef;
        }

        .card-image img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            display: block;
            border-bottom: 3px solid #0056b3;
        }

        .card-content {
            padding: 20px;
        }

        .card-content h3 {
            font-size: 1.4rem;
            color: #003366;
            margin-bottom: 5px;
            font-weight: 700;
            white-space: nowrap;
            overflow: hidden;
            text-overflow: ellipsis;
        }

        .card-content .nim {
            font-size: 1.1rem;
            font-weight: 600;
            color: #007bff;
            margin-bottom: 15px;
            padding-bottom: 10px;
            border-bottom: 1px solid #eee;
        }

        .card-info p {
            font-size: 0.95rem;
            color: #555;
            margin-bottom: 8px;
            line-height: 1.5;
        }

        .card-info p strong {
            color: #333;
            width: 100px;
            display: inline-block;
            margin-right: 5px;
        }

        .no-data {
            text-align: center;
            font-size: 1.2rem;
            color: #777;
            margin-top: 50px;
            width: 100%;
        }

        .add-card {
            display: flex;
            align-items: center;
            justify-content: center;
            cursor: pointer;
        }

        .add-card-content {
            font-size: 100px;
            font-weight: 300;
            color: #007bff;
            transition: transform 0.2s ease;
        }

        .add-card:hover .add-card-content {
            transform: scale(1.2);
            color: #0056b3;
        }

        .delete-btn {
            background-color: #dc3545;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 6px;
            cursor: pointer;
            width: 100%;
            margin-top: 15px;
            font-size: 0.95rem;
            font-weight: 600;
            transition: background-color 0.3s ease;
        }

        .delete-btn:hover {
            background-color: #c82333;
        }

        .edit-btn {
            background-color: green;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 6px;
            cursor: pointer;
            width: 100%;
            margin-top: 15px;
            font-size: 0.95rem;
            font-weight: 600;
            transition: background-color 0.3s ease;
        }

        .edits-btn:hover {
            background-color: darkgreen;
        }

        .modal {
            display: none;
            position: fixed;
            z-index: 1000;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            overflow: auto;
            background-color: rgba(0, 0, 0, 0.6);
            padding-top: 60px;
        }

        .modal-content {
            background-color: #fefefe;
            margin: 5% auto;
            padding: 30px;
            border: 1px solid #888;
            width: 90%;
            max-width: 500px;
            border-radius: 12px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.2);
            position: relative;
            animation: fadeIn 0.3s;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-20px);
            }

            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        .close-btn {
            color: #aaa;
            position: absolute;
            top: 15px;
            right: 25px;
            font-size: 32px;
            font-weight: bold;
            cursor: pointer;
        }

        .close-btn:hover,
        .close-btn:focus {
            color: #333;
        }

        .modal-content h2 {
            margin-bottom: 25px;
            color: #004a99;
            text-align: center;
        }

        .modal-form .form-group {
            margin-bottom: 18px;
        }

        .modal-form label {
            display: block;
            margin-bottom: 6px;
            font-weight: 600;
            color: #555;
        }

        .modal-form input[type="text"] {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
            font-size: 1rem;
        }

        .modal-form input[type="text"]:focus {
            border-color: #007bff;
            outline: none;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.3);
        }

        .modal-form button {
            background-color: #007bff;
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 1rem;
            font-weight: 600;
            width: 100%;
            transition: background-color 0.3s ease;
        }

        .modal-form button:hover {
            background-color: #0056b3;
        }
    </style>
</head>

<body>

    <h1>Data Mahasiswa</h1>

    <div class="card-container">

        <?php
        if (empty($mahasiswa_list)):
        ?>

            <div class="student-card add-card" id="openModalBtn">
                <div class="add-card-content">
                    <span>+</span>
                </div>
            </div>

            <p class="no-data">Tidak ada data mahasiswa yang ditemukan di database.</p>

            <?php
        else:
            foreach ($mahasiswa_list as $mhs):
                $nim    = htmlspecialchars($mhs["nim"]);
                $nama   = htmlspecialchars($mhs["nama"]);
                $kelas  = htmlspecialchars($mhs["kelas"]);
                $prodi  = htmlspecialchars($mhs["program_studi"]);
                $foto   = htmlspecialchars($mhs["foto"]);

                $path_foto_lengkap = $folder_foto . $foto;

                if (empty($foto) || !file_exists($path_foto_lengkap)) {
                    $path_foto_tampil = "https://placehold.co/320x280?text=Placeholder";
                } else {
                    $path_foto_tampil = $path_foto_lengkap;
                }
            ?>

                <div class="student-card">
                    <div class="card-image">
                        <img src="<?php echo $path_foto_tampil; ?>" alt="Foto <?php echo $nama; ?>">
                    </div>
                    <div class="card-content">
                        <h3><?php echo $nama; ?></h3>
                        <p class="nim"><?php echo $nim; ?></p>
                        <div class="card-info">
                            <p><strong>Kelas:</strong> <?php echo $kelas; ?></p>
                            <p><strong>Prodi:</strong> <?php echo $prodi; ?></p>
                        </div>

                        <button type="button" class="edit-btn open-edit-modal-btn"
                            data-nim="<?php echo $nim; ?>"
                            data-nama="<?php echo $nama; ?>"
                            data-kelas="<?php echo $kelas; ?>"
                            data-prodi="<?php echo $prodi; ?>"
                            data-foto="<?php echo $foto; ?>">
                            Edit Data
                        </button>

                        <form action="controller.php" method="POST" onsubmit="return confirm('Apakah Anda yakin ingin menghapus mahasiswa dengan NIM <?php echo $nim ?> ?');">
                            <input type="hidden" name="action" value="delete">
                            <input type="hidden" name="nim" value="<?php echo $nim; ?>">
                            <button type="submit" class="delete-btn">Hapus Data</button>
                        </form>

                    </div>
                </div>

            <?php
            endforeach;
            ?>

            <div class="student-card add-card" id="openModalBtn">
                <div class="add-card-content">
                    <span>+</span>
                </div>
            </div>

            <div>
                <p>
                    <?php
                    echo print_r($mahasiswa_list);
                    echo "<br>";
                    echo "<br>";
                    echo "$path_foto_lengkap<br>";
                    echo "<br>";
                    echo "$path_foto_tampil<br>";
                    ?>
                </p>
            </div>


        <?php
        endif;
        ?>

    </div>


    <div id="addStudentModal" class="modal">

        <div class="modal-content">
            <span class="close-btn" id="closeModalBtn">&times;</span>
            <h2>Tambah Data Mahasiswa</h2>

            <form action="controller.php" method="POST" class="modal-form">
                <input type="hidden" name="action" value="tambah">

                <div class="form-group">
                    <label for="nim">NIM:</label>
                    <input type="text" id="nim" name="nim" placeholder="Contoh: 102022400056" required>
                </div>

                <div class="form-group">
                    <label for="nama">Nama Lengkap:</label>
                    <input type="text" id="nama" name="nama" placeholder="Contoh: Itsna Akhdan Fadhil" required>
                </div>

                <div class="form-group">
                    <label for="kelas">Kelas:</label>
                    <input type="text" id="kelas" name="kelas" placeholder="Contoh: SI4808" required>
                </div>

                <div class="form-group">
                    <label for="prodi">Program Studi:</label>
                    <input type="text" id="prodi" name="program_studi" placeholder="Contoh: S1 Sistem Infromasi" required>
                </div>

                <div class="form-group">
                    <label for="foto">Nama File Foto:</label>
                    <input type="text" id="foto" name="foto" placeholder="Contoh: akhdan.jpeg">
                </div>

                <div class="form-group">
                    <button type="submit">Simpan Data</button>
                </div>
            </form>

        </div>
    </div>

    <div id="editStudentModal" class="modal">
        <div class="modal-content">
            <span class="close-btn" id="closeEditModalBtn">&times;</span>
            <h2>Edit Data Mahasiswa</h2>

            <form action="controller.php" method="POST" class="modal-form">
                <input type="hidden" name="action" value="edit">

                <input type="hidden" id="edit_nim" name="nim">

                <div class="form-group">
                    <label for="edit_nama">Nama Lengkap:</label>
                    <input type="text" id="edit_nama" name="nama" placeholder="Contoh: Itsna Akhdan Fadhil" required>
                </div>

                <div class="form-group">
                    <label for="edit_kelas">Kelas:</label>
                    <input type="text" id="edit_kelas" name="kelas" placeholder="Contoh: SI4808" required>
                </div>

                <div class="form-group">
                    <label for="edit_prodi">Program Studi:</label>
                    <input type="text" id="edit_prodi" name="program_studi" placeholder="Contoh: S1 Sistem Infromasi" required>
                </div>

                <div class="form-group">
                    <label for="edit_foto">Nama File Foto:</label>
                    <input type="text" id="edit_foto" name="foto" placeholder="Contoh: akhdan.jpeg">
                </div>

                <div class="form-group">
                    <button type="submit">Simpan Perubahan</button>
                </div>
            </form>
        </div>
    </div>


    <script>
        var modal = document.getElementById("addStudentModal");
        var btn = document.getElementById("openModalBtn");
        var span = document.getElementById("closeModalBtn");

        if (btn) {
            btn.onclick = function() {
                modal.style.display = "block";
            }
        }
        if (span) {
            span.onclick = function() {
                modal.style.display = "none";
            }
        }

        var editModal = document.getElementById("editStudentModal");
        var editSpan = document.getElementById("closeEditModalBtn");

        var allEditButtons = document.querySelectorAll(".open-edit-modal-btn");

        allEditButtons.forEach(function(button) {
            button.onclick = function() {
                var nim = button.dataset.nim;
                var nama = button.dataset.nama;
                var kelas = button.dataset.kelas;
                var prodi = button.dataset.prodi;
                var foto = button.dataset.foto;

                document.getElementById("edit_nim").value = nim;
                document.getElementById("edit_nama").value = nama;
                document.getElementById("edit_kelas").value = kelas;
                document.getElementById("edit_prodi").value = prodi;
                document.getElementById("edit_foto").value = foto;

                editModal.style.display = "block";
            }
        });

        if (editSpan) {
            editSpan.onclick = function() {
                editModal.style.display = "none";
            }
        }

        window.onclick = function(event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
            if (event.target == editModal) {
                editModal.style.display = "none";
            }
        }
    </script>

</body>

</html>