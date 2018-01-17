-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2018 at 11:12 AM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `waramundb`
--

-- --------------------------------------------------------

--
-- Table structure for table `epl_player`
--

CREATE TABLE `epl_player` (
  `TRX_ID` int(11) NOT NULL,
  `PLAYER_ID` int(11) NOT NULL,
  `CLUB_ID` int(11) DEFAULT NULL,
  `YEAR_SIGNED` year(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `epl_player`
--

INSERT INTO `epl_player` (`TRX_ID`, `PLAYER_ID`, `CLUB_ID`, `YEAR_SIGNED`) VALUES
(1, 1, 1, 2016),
(2, 27, 2, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `epl_player`
--
ALTER TABLE `epl_player`
  ADD PRIMARY KEY (`TRX_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `epl_player`
--
ALTER TABLE `epl_player`
  MODIFY `TRX_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
