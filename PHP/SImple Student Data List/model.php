<?php

class Database
{
    public $conn;

    public function __construct()
    {
        $this->conn = new mysqli("localhost", "root", "", "wad_week6");

        if ($this->conn->connect_error) {
            die("Koneksi database gagal: " . $this->conn->connect_error);
        }
    }


    public function __destruct()
    {
        $this->conn->close();
    }
}
