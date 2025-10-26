-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 25, 2025 at 07:38 AM
-- Server version: 8.4.3
-- PHP Version: 8.3.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wad_week6`
--

-- --------------------------------------------------------

--
-- Table structure for table `itsnaakhdanfadhil`
--

CREATE TABLE `itsnaakhdanfadhil` (
  `ID` int NOT NULL,
  `NIM` bigint NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Kelas` varchar(100) NOT NULL,
  `Program_Studi` varchar(100) NOT NULL,
  `Foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `itsnaakhdanfadhil`
--

INSERT INTO `itsnaakhdanfadhil` (`ID`, `NIM`, `Nama`, `Kelas`, `Program_Studi`, `Foto`) VALUES
(12, 102022400056, 'Itsna Akhdann Fadhil', 'SI4808', 'S1 Sistem Informasi', 'foto.jpeg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `itsnaakhdanfadhil`
--
ALTER TABLE `itsnaakhdanfadhil`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `itsnaakhdanfadhil`
--
ALTER TABLE `itsnaakhdanfadhil`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
