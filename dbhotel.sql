-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2024 at 04:07 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbhotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `id_akun` int(11) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `uname` text NOT NULL,
  `pwd` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`id_akun`, `first_name`, `last_name`, `email`, `uname`, `pwd`) VALUES
(1, '', '', '', 'admin', 'admin123'),
(4, 'aghnia', 'nurhidayah', 'aghnianurhidayah@gmail.com', 'nia', 'nia123'),
(5, 'navira', 'arditha aulia', 'navirarrr@gmail.com', 'adri', 'adri123'),
(6, 'adriati', 'manuk allo', 'adriatimank75@gmail.com', 'tiaadri15', 'hambaallah33'),
(7, 'a', 'a', 'a', 'a', 'a'),
(8, 'Aghnia', 'Nurhidayah', 'aghnia@gmail.com', 'nia123', 'nia123');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `id_reservation` int(11) NOT NULL,
  `id_akun` int(11) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(25) NOT NULL,
  `rsv_date` date NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `room_type` varchar(15) NOT NULL,
  `adult` int(1) NOT NULL,
  `children` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id_reservation`, `id_akun`, `first_name`, `last_name`, `email`, `phone`, `address`, `city`, `rsv_date`, `check_in`, `check_out`, `room_type`, `adult`, `children`) VALUES
(3, 4, 'aghnia', 'nurhidayah', 'aghnia@gmail.com', '089677565572', 'Gg. Alam Segar', 'Balikpapan', '2024-05-30', '2024-05-16', '2024-05-18', 'Double', 4, 2),
(4, 5, 'Narupa ', 'Rangga Goroguta', 'naruparangga@gmail.com', '081354556778', 'Jl. Perjuangan 1', 'Samarinda ', '2024-05-30', '2024-05-15', '2024-05-18', 'Double', 3, 1),
(5, 6, 'Aprisa', 'Idma Mutiara', 'aprisaidma@gmail.com', '085766778925', 'Jl. Pramuka', 'Samarinda ', '2024-05-30', '2024-05-15', '2024-05-17', 'Double', 3, 2),
(6, 8, 'Juniver', 'Veronika Lili', 'juniverlili@gmail.com', '089965431890', 'Jl. Gelatik', 'Samarinda ', '2024-05-30', '2024-05-24', '2024-05-25', 'Double', 4, 3),
(7, 8, 'Anna', 'Aulia Sandy', 'annaaulia@gmail.com', '081351831783', 'Jl. Perjuangan 6', 'Samarinda ', '2024-05-30', '2024-05-24', '2024-05-31', 'Suite', 3, 1),
(59, 8, 'a', 'a', 'a', '1', 'a', 'Jakarta', '2024-06-11', '2024-06-13', '2024-06-15', 'Suite', 1, 0),
(60, 8, 'Aghnia', 'Nurhidayah', 'aghnianurhidayah@gmail.com', '081351831683', 'Jl. Perjuangan', 'Samarinda ', '2024-06-12', '2024-06-13', '2024-06-15', 'Double', 2, 0),
(61, 8, 'nia', 'nia', 'nia', '1', 'nia', 'Kediri', '2024-06-12', '2024-06-13', '2024-06-20', 'Suite', 1, 0),
(62, 8, 'a', 'a', 'a', '1', 'a', 'Jakarta', '2024-06-12', '2024-06-12', '2024-06-06', 'Suite', 1, 0),
(63, 8, 'adriati', 'manuk allo', 'adriatimanukallo@gmail.com', '081351831683', 'jln. perjuangan', 'Samarinda ', '2024-06-12', '2024-06-21', '2024-06-22', 'Suite', 4, 0),
(64, 8, 'Dwi Rizky', 'Ananda', 'dwirizky@gmail.com', '081351831683', 'Jl. Perjuangan', 'Samarinda ', '2024-06-12', '2024-06-14', '2024-06-15', 'Suite', 5, 0),
(65, 8, 'Tri Dio', 'Alif Syaputra', 'tridio@gmail.com', '081234567891', 'Jl. Pramuka', 'Samarinda ', '2024-06-12', '2024-06-14', '2024-06-22', 'Suite', 4, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id_akun`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id_reservation`),
  ADD KEY `FK_IdAkun` (`id_akun`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `id_akun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id_reservation` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FK_IdAkun` FOREIGN KEY (`id_akun`) REFERENCES `akun` (`id_akun`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
