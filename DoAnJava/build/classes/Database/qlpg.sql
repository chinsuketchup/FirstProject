-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th9 15, 2022 lúc 10:04 AM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlpg`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Capnhattv`
--

CREATE TABLE `Capnhattv` (
  `hoten` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nic` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sdt` int(11) NOT NULL,
  `diachi` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hangthanhvien` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `idthanhvien` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dangkytren` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dangkyboi` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `biennhan` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hinhthucthanhtoan` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `capnhatlancuoi` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lienhe` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `chieucao` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cannang` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bmi` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nhanxet` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `Capnhattv`
--

INSERT INTO `Capnhattv` (`hoten`, `nic`, `sdt`, `diachi`, `email`, `hangthanhvien`, `idthanhvien`, `dangkytren`, `dangkyboi`, `biennhan`, `hinhthucthanhtoan`, `capnhatlancuoi`, `lienhe`, `gioitinh`, `chieucao`, `cannang`, `bmi`, `nhanxet`) VALUES
('Thanh', '002', 903645509, '390 Hoang Van Thu', '20005739@lttc.edu.vn', 'Cardio', '1', '14/09/2022', 'Thanh', '001', 'Tien mat', '14/09/2022', '0909326991', 'Nam', '1.72', '53', '9.3', 'Test');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Chitiet`
--

CREATE TABLE `Chitiet` (
  `id` int(11) NOT NULL,
  `tong` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bienlai` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `thanhtoan` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngay` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `thanhtoanboi` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `Chitiet`
--

INSERT INTO `Chitiet` (`id`, `tong`, `bienlai`, `thanhtoan`, `ngay`, `thanhtoanboi`) VALUES
(1, '30000', '001', '30000', '20/11/2020', 'Thanh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Login`
--

CREATE TABLE `Login` (
  `tendangnhap` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `matkhau` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `Login`
--

INSERT INTO `Login` (`tendangnhap`, `matkhau`) VALUES
('admin', '1234');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Themthanhvien`
--

CREATE TABLE `Themthanhvien` (
  `id` int(11) NOT NULL,
  `hoten` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nic` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sdt` int(11) NOT NULL,
  `diachi` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lienhe` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hangthanhvien` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `biennhan` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hinhthucthanhtoan` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `chieucao` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cannang` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nhanxet` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `Themthanhvien`
--

INSERT INTO `Themthanhvien` (`id`, `hoten`, `nic`, `sdt`, `diachi`, `email`, `lienhe`, `hangthanhvien`, `biennhan`, `hinhthucthanhtoan`, `gioitinh`, `chieucao`, `cannang`, `nhanxet`) VALUES
(1, 'Đặng Ngọc Thanh', '0032', 903645509, '390 Hoàng Văn Thụ', '20005739@lttc.edu.vn', '0909326991', 'Cardio', '120', '199k/Ngày', 'Nam', '1.72', '53', 'Test database');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `Chitiet`
--
ALTER TABLE `Chitiet`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `Themthanhvien`
--
ALTER TABLE `Themthanhvien`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
