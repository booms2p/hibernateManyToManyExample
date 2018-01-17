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
-- Table structure for table `footballplayer`
--

CREATE TABLE `footballplayer` (
  `PLAYER_ID` int(10) NOT NULL,
  `PLAYER_FNAME` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `PLAYER_LNAME` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `PLAYER_BIRTHDATE` date NOT NULL,
  `COUNTRY_ID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `footballplayer`
--

INSERT INTO `footballplayer` (`PLAYER_ID`, `PLAYER_FNAME`, `PLAYER_LNAME`, `PLAYER_BIRTHDATE`, `COUNTRY_ID`) VALUES
(1, 'เดวิด', 'เบคแฮม', '1975-05-02', 1),
(13, 'เวนย์', 'รูนีย์', '1985-10-24', 1),
(14, 'ฮวน', 'มาต้า', '1988-04-28', 4),
(27, 'แฮรี่', 'เคน', '1993-07-28', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `footballplayer`
--
ALTER TABLE `footballplayer`
  ADD PRIMARY KEY (`PLAYER_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `footballplayer`
--
ALTER TABLE `footballplayer`
  MODIFY `PLAYER_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
