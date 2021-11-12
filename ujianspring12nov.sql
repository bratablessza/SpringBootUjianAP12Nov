-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 12, 2021 at 07:13 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ujianspring12nov`
--

-- --------------------------------------------------------

--
-- Table structure for table `bensin`
--

CREATE TABLE `bensin` (
  `id` bigint(20) NOT NULL,
  `harga` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `oktan` int(11) NOT NULL,
  `perusahaan` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bensin`
--

INSERT INTO `bensin` (`id`, `harga`, `nama`, `oktan`, `perusahaan`) VALUES
(7, 12270, 'V-power Nitro+', 98, 'Shell'),
(6, 12030, 'V-power', 95, 'Shell'),
(5, 11550, 'Super', 92, 'Shell'),
(4, 12000, 'Pertamax Turbo', 98, 'Pertamina'),
(3, 9000, 'Pertamax', 92, 'Pertamina'),
(2, 7650, 'Pertalite', 90, 'Pertamina'),
(1, 6150, 'Premium', 88, 'Pertamina'),
(8, 12500, 'BP 90', 90, 'BP'),
(9, 12860, 'BP 92', 92, 'BP'),
(10, 13400, 'BP 95', 95, 'BP');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bensin`
--
ALTER TABLE `bensin`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bensin`
--
ALTER TABLE `bensin`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
