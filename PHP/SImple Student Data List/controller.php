<?php
require_once 'model.php';


$folder_foto = "./foto/";

$mahasiswa_model = new MahasiswaModel();

class MahasiswaModel
{
    private $db;

    public function __construct()
    {
        $this->db = new Database();
    }

    public function getAllMahasiswa()
    {
        $sql = "SELECT nim, nama, kelas, program_studi, foto FROM itsnaakhdanfadhil ORDER BY nama ASC";
        $result = $this->db->conn->query($sql);

        $mahasiswa_list = [];

        if ($result->num_rows > 0) {
            while ($row = $result->fetch_assoc()) {
                $mahasiswa_list[] = $row;
            }
        }

        return $mahasiswa_list;
    }

    public function addMahasiswa($nama, $nim, $kelas, $program_studi, $foto)
    {
        $sql = "INSERT INTO itsnaakhdanfadhil (nama, nim, kelas, program_studi, foto) VALUES ('$nama', '$nim', '$kelas', '$program_studi', '$foto')";
        $stmt = $this->db->conn->query($sql);

        if (!$stmt) {
            return false;
        }
        return $stmt;
    }

    public function deleteMahasiswa($nim)
    {
        $sql = "DELETE FROM itsnaakhdanfadhil WHERE NIM = $nim";
        $stmt = $this->db->conn->query($sql);

        if (!$stmt) {
            return false;
        }

        return $stmt;
    }

    public function editMahasiswa($nama, $nim, $kelas, $program_studi, $foto)
    {
        $sql = "UPDATE itsnaakhdanfadhil SET nama = '$nama', kelas = '$kelas', program_studi = '$program_studi', foto = '$foto' WHERE NIM = '$nim'";


        $stmt = $this->db->conn->query($sql);

        if (!$stmt) {
            return false;
        }
        return $stmt;
    }
}

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['action'])) {

    if ($_POST['action'] == 'tambah') {

        $nim            = $_POST['nim'];
        $nama           = $_POST['nama'];
        $kelas          = $_POST['kelas'];
        $program_studi  = $_POST['program_studi'];
        $foto           = $_POST['foto'];

        $success = $mahasiswa_model->addMahasiswa($nama, $nim, $kelas, $program_studi, $foto);

        header("Location: view.php");
        exit;
    } elseif ($_POST['action'] == 'delete') {

        $nim_to_delete = $_POST['nim'];

        $success = $mahasiswa_model->deleteMahasiswa($nim_to_delete);

        header("Location: view.php");
        exit;
    } elseif ($_POST['action'] == 'edit') {

        $nim            = $_POST['nim'];
        $nama           = $_POST['nama'];
        $kelas          = $_POST['kelas'];
        $program_studi  = $_POST['program_studi'];
        $foto           = $_POST['foto'];

        $success = $mahasiswa_model->editMahasiswa($nama, $nim, $kelas, $program_studi, $foto);

        header("Location: view.php");
        exit;
    }
}

$mahasiswa_list = $mahasiswa_model->getAllMahasiswa();
