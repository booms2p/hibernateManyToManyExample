-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2018 at 11:13 AM
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
-- Table structure for table `epl_club`
--

CREATE TABLE `epl_club` (
  `CLUB_ID` int(11) NOT NULL,
  `CLUB_NAME` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `STADIUM_ID` int(11) NOT NULL,
  `LASTEST_EPL_CHAMP` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `epl_club`
--

INSERT INTO `epl_club` (`CLUB_ID`, `CLUB_NAME`, `STADIUM_ID`, `LASTEST_EPL_CHAMP`) VALUES
(2, 'Tottenham Hotspur', 1, 0000),
(3, 'Manchester United', 1, 2013);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `epl_club`
--
ALTER TABLE `epl_club`
  ADD PRIMARY KEY (`CLUB_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `epl_club`
--
ALTER TABLE `epl_club`
  MODIFY `CLUB_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
