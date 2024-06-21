-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2024 at 12:45 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectakhhirpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `accoount`
--

CREATE TABLE `accoount` (
  `username` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accoount`
--

INSERT INTO `accoount` (`username`, `password`) VALUES
('ka', 'ja'),
('kal', 'ja'),
('oi', 'wi'),
('wo', 'lo'),
('kaels', 'kaels'),
('asu', 'asu'),
('konwl', 'konwl'),
('wahyu', 'wahyul'),
('udin', 'udinl'),
('ucok', 'ucokl');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `ID_Barang` varchar(255) NOT NULL,
  `Nama_Barang` varchar(20) NOT NULL,
  `Jenis` varchar(50) NOT NULL,
  `Ukuran` varchar(5) NOT NULL,
  `HargaBeli` decimal(10,0) NOT NULL,
  `HargaJual` decimal(10,0) NOT NULL,
  `Stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`ID_Barang`, `Nama_Barang`, `Jenis`, `Ukuran`, `HargaBeli`, `HargaJual`, `Stok`) VALUES
('BR002', 'Blazer', 'Jaket', 'L', '500000', '800000', 20),
('BR003', 'Sherpa Zara', 'Jaket', 'L', '170000', '200000', 20),
('BR004', 'Jacket Vintage', 'Jaket', 'XL', '200000', '200000', 20),
('BR005', 'Carhart Pants', 'Jaket', 'XL', '500000', '500000', 20),
('BR006', 'Cardigan', 'Jaket', 'S', '60000', '80000', 60),
('BR007', 'Carhart', 'Celana', 'M', '80000', '100000', 20),
('BR008', 'Kemeja Korea', 'Kemeja', 'XXL', '70000', '75000', 50);

-- --------------------------------------------------------

--
-- Table structure for table `mancatalog`
--

CREATE TABLE `mancatalog` (
  `id` int(20) NOT NULL,
  `blazer` varchar(50) NOT NULL,
  `sherpazara` varchar(50) NOT NULL,
  `jacketvintage` varchar(50) NOT NULL,
  `carhartpants` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `NoFaktur` varchar(20) NOT NULL,
  `Tanggal` varchar(20) NOT NULL,
  `ID_Costumer` varchar(10) NOT NULL,
  `TotalBeli` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`NoFaktur`, `Tanggal`, `ID_Costumer`, `TotalBeli`) VALUES
('TR0001', '13-06-2024', '1', '0'),
('TR0002', '13-06-2024', 'ka01', '0'),
('TR0003', '13-06-2024', '', '0'),
('TR0004', '13-06-2024', 'CS01', '568041472'),
('TR0005', '13-06-2024', 'KL002', '500000'),
('TR0006', '13-06-2024', 'kl001', '1000000'),
('TR0007', '13-06-2024', 'hahah001', '1600000'),
('TR0008', '13-06-2024', '1402023036', '1000000'),
('TR0009', '14-06-2024', '1420203028', '2400000'),
('TR0010', '14-06-2024', 'KL021', '1600000');

-- --------------------------------------------------------

--
-- Table structure for table `penjualanrinci`
--

CREATE TABLE `penjualanrinci` (
  `NoFaktur` varchar(20) NOT NULL,
  `ID_Barang` varchar(10) NOT NULL,
  `NAMA_Barang` varchar(50) NOT NULL,
  `Jumlah` int(11) NOT NULL,
  `Harga` decimal(10,0) NOT NULL,
  `Total` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penjualanrinci`
--

INSERT INTO `penjualanrinci` (`NoFaktur`, `ID_Barang`, `NAMA_Barang`, `Jumlah`, `Harga`, `Total`) VALUES
('TR0004', 'BR002', 'Blazer', 800000, '500000', '568041472'),
('TR0005', 'BR002', 'Blazer', 1, '500000', '500000'),
('TR0006', 'BR002', 'Blazer', 2, '500000', '1000000'),
('TR0007', 'BR002', 'Blazer', 2, '800000', '1600000'),
('TR0008', 'BR003', 'Sherpa Zara', 5, '200000', '1000000'),
('TR0009', 'BR002', 'Blazer', 2, '500000', '1000000'),
('TR0009', 'BR009', 'Kemeja', 7, '200000', '1400000'),
('TR0010', 'BR002', 'Blazer', 2, '800000', '1600000'),
('TR0011', 'BR002', 'Blazer', 2, '800000', '1600000');

-- --------------------------------------------------------

--
-- Table structure for table `womencatalog`
--

CREATE TABLE `womencatalog` (
  `id` int(50) NOT NULL,
  `varsity` varchar(20) DEFAULT NULL,
  `base ball` varchar(20) DEFAULT NULL,
  `hoodie` varchar(20) DEFAULT NULL,
  `boombers` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`ID_Barang`);

--
-- Indexes for table `mancatalog`
--
ALTER TABLE `mancatalog`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`NoFaktur`),
  ADD UNIQUE KEY `ID_Costumer` (`ID_Costumer`);

--
-- Indexes for table `womencatalog`
--
ALTER TABLE `womencatalog`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mancatalog`
--
ALTER TABLE `mancatalog`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `womencatalog`
--
ALTER TABLE `womencatalog`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
