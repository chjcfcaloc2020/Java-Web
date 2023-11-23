-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2023 at 06:40 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sinhvien_tn`
--

-- --------------------------------------------------------

--
-- Table structure for table `cong_viec`
--

CREATE TABLE `cong_viec` (
  `cmnd` int(50) NOT NULL,
  `ngay_vao_cong_ty` date NOT NULL,
  `ma_nganh` varchar(50) NOT NULL,
  `ten_cong_viec` varchar(255) NOT NULL,
  `ten_cong_ty` varchar(255) NOT NULL,
  `dia_chi_cong_ty` varchar(255) NOT NULL,
  `thoi_gian_lam_viec` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nganh`
--

CREATE TABLE `nganh` (
  `ma_nganh` varchar(50) NOT NULL,
  `ten_nganh` varchar(255) NOT NULL,
  `loai_nganh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nganh`
--

INSERT INTO `nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES
('AI', 'Artificial Intelligence', 'CNTT'),
('SE', 'Software Engineering', 'CNTT');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `cmnd` int(50) NOT NULL,
  `hoten` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `so_dt` varchar(50) NOT NULL,
  `dia_chi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tot_nghiep`
--

CREATE TABLE `tot_nghiep` (
  `cmnd` int(50) NOT NULL,
  `ma_truong` varchar(50) NOT NULL,
  `ma_nganh` varchar(50) NOT NULL,
  `he_tn` varchar(50) NOT NULL,
  `ngay_tn` date NOT NULL,
  `loai_tn` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `truong`
--

CREATE TABLE `truong` (
  `ma_truong` varchar(50) NOT NULL,
  `ten_truong` varchar(255) NOT NULL,
  `dia_chi` varchar(255) NOT NULL,
  `so_dt` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `truong`
--

INSERT INTO `truong` (`ma_truong`, `ten_truong`, `dia_chi`, `so_dt`) VALUES
('VKU', 'Vietnam-Korea University of Information and Communication Technology', 'Da Nang', '123123123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cong_viec`
--
ALTER TABLE `cong_viec`
  ADD PRIMARY KEY (`cmnd`,`ngay_vao_cong_ty`),
  ADD KEY `fk_work_2` (`ma_nganh`);

--
-- Indexes for table `nganh`
--
ALTER TABLE `nganh`
  ADD PRIMARY KEY (`ma_nganh`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`cmnd`);

--
-- Indexes for table `tot_nghiep`
--
ALTER TABLE `tot_nghiep`
  ADD PRIMARY KEY (`cmnd`,`ma_truong`,`ma_nganh`),
  ADD KEY `fk_tn_2` (`ma_truong`),
  ADD KEY `fk_tn_3` (`ma_nganh`);

--
-- Indexes for table `truong`
--
ALTER TABLE `truong`
  ADD PRIMARY KEY (`ma_truong`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cong_viec`
--
ALTER TABLE `cong_viec`
  ADD CONSTRAINT `fk_work` FOREIGN KEY (`cmnd`) REFERENCES `sinhvien` (`cmnd`),
  ADD CONSTRAINT `fk_work_2` FOREIGN KEY (`ma_nganh`) REFERENCES `nganh` (`ma_nganh`);

--
-- Constraints for table `tot_nghiep`
--
ALTER TABLE `tot_nghiep`
  ADD CONSTRAINT `fk_tn_1` FOREIGN KEY (`cmnd`) REFERENCES `sinhvien` (`cmnd`),
  ADD CONSTRAINT `fk_tn_2` FOREIGN KEY (`ma_truong`) REFERENCES `truong` (`ma_truong`),
  ADD CONSTRAINT `fk_tn_3` FOREIGN KEY (`ma_nganh`) REFERENCES `nganh` (`ma_nganh`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
