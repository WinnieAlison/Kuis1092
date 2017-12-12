-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.39
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1092`
--
CREATE DATABASE IF NOT EXISTS `kuis1092` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `kuis1092`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1092`
--

CREATE TABLE `cv_1092` (
  `id_cv` bigint(20) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tempatlahir` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1092`
--

INSERT INTO `cv_1092` (`id_cv`, `alamat`, `nama`, `tempatlahir`) VALUES
(1, 'Setia Budi', 'Winnie Alison', 'Pekanbaru'),
(2, 'Sudirman', 'Leo', 'Medan'),
(3, 'Rumbai', 'Mins', 'Padang');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1092`
--

CREATE TABLE `nilai_1092` (
  `id_nilai` bigint(20) NOT NULL,
  `id_cv` bigint(20) NOT NULL,
  `matkul` varchar(255) DEFAULT NULL,
  `nilai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1092`
--

INSERT INTO `nilai_1092` (`id_nilai`, `id_cv`, `matkul`, `nilai`) VALUES
(1, 2, 'AKJK', '90'),
(2, 2, 'Teknologi Web', '84'),
(3, 1, 'AKJK', '95');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1092`
--
ALTER TABLE `cv_1092`
  ADD PRIMARY KEY (`id_cv`);

--
-- Indexes for table `nilai_1092`
--
ALTER TABLE `nilai_1092`
  ADD PRIMARY KEY (`id_nilai`),
  ADD KEY `FK9axgehqac92egrb5o1okr49v7` (`id_cv`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1092`
--
ALTER TABLE `cv_1092`
  MODIFY `id_cv` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1092`
--
ALTER TABLE `nilai_1092`
  MODIFY `id_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1092`
--
ALTER TABLE `nilai_1092`
  ADD CONSTRAINT `FK9axgehqac92egrb5o1okr49v7` FOREIGN KEY (`id_cv`) REFERENCES `cv_1092` (`id_cv`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
