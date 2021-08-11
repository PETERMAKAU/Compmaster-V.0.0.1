-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 07, 2021 at 11:10 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `compmaster`
--

-- --------------------------------------------------------

--
-- Table structure for table `comb_vw_name_tabs_machax_tabs`
--

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `compmaster`.`comb_vw_name_tabs_machax_tabs` AS select `a`.`id` AS `a_id`,`a`.`chandata_code` AS `a_chandata_code`,`a`.`str_asset_body` AS `a_str_asset_body`,`a`.`asset_status` AS `a_asset_status`,`b`.`id` AS `b_id`,`b`.`chandata_code` AS `b_chandata_code`,`b`.`str_asset_body` AS `b_str_asset_body`,`b`.`asset_status` AS `b_asset_status` from (`compmaster`.`view_machax_tabs` `a` join `compmaster`.`view_name_tabs` `b`);
-- in use (#1356 - View 'compmaster.comb_vw_name_tabs_machax_tabs' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them)

-- --------------------------------------------------------

--
-- Table structure for table `selectnonemptyvalues`
--

CREATE TABLE IF NOT EXISTS `selectnonemptyvalues` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_chandata`
--

CREATE TABLE IF NOT EXISTS `tbl_chandata` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `chandata_code` varchar(100) NOT NULL,
  `chandata` varchar(100) NOT NULL,
  `asset_number` varchar(400) NOT NULL,
  `str_asset_body` varchar(100) NOT NULL,
  `str_def_asset_body` varchar(100) NOT NULL,
  `asset_status` varchar(100) NOT NULL,
  `pos_counter` varchar(8) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6734 ;

--
-- Dumping data for table `tbl_chandata`
--

INSERT INTO `tbl_chandata` (`id`, `chandata_code`, `chandata`, `asset_number`, `str_asset_body`, `str_def_asset_body`, `asset_status`, `pos_counter`) VALUES
(6604, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[0]', '$MC_AXCONF_MACHAX_USED', '1', '1'),
(6605, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[1]', '$MC_AXCONF_MACHAX_USED', '2', '2'),
(6606, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[2]', '$MC_AXCONF_MACHAX_USED', '3', '3'),
(6607, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[3]', '$MC_AXCONF_MACHAX_USED', '4', '4'),
(6608, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[4]', '$MC_AXCONF_MACHAX_USED', '5', '5'),
(6609, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[5]', '$MC_AXCONF_MACHAX_USED', '6', '6'),
(6610, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[6]', '$MC_AXCONF_MACHAX_USED', '7', '7'),
(6611, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[10]', '$MC_AXCONF_MACHAX_USED', '11', '11'),
(6612, '9c6fda46', 'CHANDATA(1)', 'N20070', '$MC_AXCONF_MACHAX_USED[12]', '$MC_AXCONF_MACHAX_USED', '13', '13'),
(6613, 'a201a180', 'CHANDATA(1)', '-', '-', '-', '-', '-'),
(6614, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[0]', '$MN_AXCONF_MACHAX_NAME_TAB', '"X1"', '1'),
(6615, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[1]', '$MN_AXCONF_MACHAX_NAME_TAB', '"Y1"', '2'),
(6616, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[2]', '$MN_AXCONF_MACHAX_NAME_TAB', '"Z1"', '3'),
(6617, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[3]', '$MN_AXCONF_MACHAX_NAME_TAB', '"A1"', '4'),
(6618, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[4]', '$MN_AXCONF_MACHAX_NAME_TAB', '"C1"', '5'),
(6619, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[5]', '$MN_AXCONF_MACHAX_NAME_TAB', '"SP1"', '6'),
(6620, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[6]', '$MN_AXCONF_MACHAX_NAME_TAB', '"XF1"', '7'),
(6621, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[10]', '$MN_AXCONF_MACHAX_NAME_TAB', '"ATCR1"', '11'),
(6622, '288d9d01', 'CHANDATA(1)', 'N10000', '$MN_AXCONF_MACHAX_NAME_TAB[12]', '$MN_AXCONF_MACHAX_NAME_TAB', '"ATCG1"', '13'),
(6623, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[0]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX1"', '1'),
(6624, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[1]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX2"', '2'),
(6625, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[2]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX3"', '3'),
(6626, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[3]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX4"', '4'),
(6627, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[4]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX5"', '5'),
(6628, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[5]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX6"', '6'),
(6629, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[6]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX7"', '7'),
(6630, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[10]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX11"', '11'),
(6631, '288d9d01', 'CHANDATA(1)', 'N10002', '$MN_AXCONF_LOGIC_MACHAX_TAB[12]', '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX13"', '13'),
(6632, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[0]', '$MN_MM_CEC_MAX_POINTS', '16', '1'),
(6633, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[1]', '$MN_MM_CEC_MAX_POINTS', '21', '2'),
(6634, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[2]', '$MN_MM_CEC_MAX_POINTS', '25', '3'),
(6635, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[3]', '$MN_MM_CEC_MAX_POINTS', '45', '4'),
(6636, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[4]', '$MN_MM_CEC_MAX_POINTS', '73', '5'),
(6637, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[5]', '$MN_MM_CEC_MAX_POINTS', '16', '6'),
(6638, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[6]', '$MN_MM_CEC_MAX_POINTS', '16', '7'),
(6639, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[10]', '$MN_MM_CEC_MAX_POINTS', '21', '11'),
(6640, '288d9d01', 'CHANDATA(1)', 'N18342', '$MN_MM_CEC_MAX_POINTS[12]', '$MN_MM_CEC_MAX_POINTS', '25', '13'),
(6641, 'b0d29cb9', 'CHANDATA(1)', '-', '-', '-', '-', '-'),
(6642, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX1]', '$MA_IS_ROT_AX', '0', '1'),
(6643, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX2]', '$MA_IS_ROT_AX', '0', '2'),
(6644, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX3]', '$MA_IS_ROT_AX', '0', '3'),
(6645, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX4]', '$MA_IS_ROT_AX', '1', '4'),
(6646, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX5]', '$MA_IS_ROT_AX', '1', '5'),
(6647, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX6]', '$MA_IS_ROT_AX', '1', '6'),
(6648, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX7]', '$MA_IS_ROT_AX', '0', '7'),
(6649, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX11]', '$MA_IS_ROT_AX', '1', '11'),
(6650, 'd01e07e0', 'CHANDATA(1)', 'N30300', '$MA_IS_ROT_AX[AX13]', '$MA_IS_ROT_AX', '1', '13'),
(6651, 'a59c8290', 'CHANDATA(1)', '-', '-', '-', '-', '-'),
(6652, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX1]', '$MA_NUM_ENCS', '1', '1'),
(6653, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX1]', '$MA_ENC_IS_LINEAR[0]', '1', '1'),
(6654, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX1]', '$MA_ENC_IS_LINEAR[1]', '0', '1'),
(6655, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX1]', '$MA_ENC_COMP_ENABLE[0]', '0', '1'),
(6656, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX1]', '$MA_ENC_COMP_ENABLE[1]', '0', '1'),
(6657, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX1]', '$MA_CEC_ENABLE', '1', '1'),
(6658, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX1]', '$MA_POS_LIMIT_MINUS', '-0.6', '1'),
(6659, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX1]', '$MA_POS_LIMIT_PLUS', '1500.6', '1'),
(6660, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX1]', '$MA_GANTRY_AXIS_TYPE', '1', '1'),
(6661, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX2]', '$MA_NUM_ENCS', '1', '2'),
(6662, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX2]', '$MA_ENC_IS_LINEAR[0]', '1', '2'),
(6663, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX2]', '$MA_ENC_IS_LINEAR[1]', '0', '2'),
(6664, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX2]', '$MA_ENC_COMP_ENABLE[0]', '0', '2'),
(6665, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX2]', '$MA_ENC_COMP_ENABLE[1]', '0', '2'),
(6666, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX2]', '$MA_CEC_ENABLE', '1', '2'),
(6667, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX2]', '$MA_POS_LIMIT_MINUS', '-0.6', '2'),
(6668, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX2]', '$MA_POS_LIMIT_PLUS', '2000.6', '2'),
(6669, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX2]', '$MA_GANTRY_AXIS_TYPE', '0', '2'),
(6670, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX3]', '$MA_NUM_ENCS', '1', '3'),
(6671, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX3]', '$MA_ENC_IS_LINEAR[0]', '1', '3'),
(6672, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX3]', '$MA_ENC_IS_LINEAR[1]', '0', '3'),
(6673, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX3]', '$MA_ENC_COMP_ENABLE[0]', '0', '3'),
(6674, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX3]', '$MA_ENC_COMP_ENABLE[1]', '0', '3'),
(6675, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX3]', '$MA_CEC_ENABLE', '1', '3'),
(6676, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX3]', '$MA_POS_LIMIT_MINUS', '-0.6', '3'),
(6677, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX3]', '$MA_POS_LIMIT_PLUS', '1200.6', '3'),
(6678, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX3]', '$MA_GANTRY_AXIS_TYPE', '0', '3'),
(6679, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX4]', '$MA_NUM_ENCS', '1', '4'),
(6680, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX4]', '$MA_ENC_IS_LINEAR[0]', '0', '4'),
(6681, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX4]', '$MA_ENC_IS_LINEAR[1]', '0', '4'),
(6682, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX4]', '$MA_ENC_COMP_ENABLE[0]', '0', '4'),
(6683, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX4]', '$MA_ENC_COMP_ENABLE[1]', '0', '4'),
(6684, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX4]', '$MA_CEC_ENABLE', '1', '4'),
(6685, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX4]', '$MA_POS_LIMIT_MINUS', '-110.6', '4'),
(6686, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX4]', '$MA_POS_LIMIT_PLUS', '110.6', '4'),
(6687, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX4]', '$MA_GANTRY_AXIS_TYPE', '0', '4'),
(6688, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX5]', '$MA_NUM_ENCS', '1', '5'),
(6689, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX5]', '$MA_ENC_IS_LINEAR[0]', '0', '5'),
(6690, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX5]', '$MA_ENC_IS_LINEAR[1]', '0', '5'),
(6691, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX5]', '$MA_ENC_COMP_ENABLE[0]', '0', '5'),
(6692, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX5]', '$MA_ENC_COMP_ENABLE[1]', '0', '5'),
(6693, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX5]', '$MA_CEC_ENABLE', '1', '5'),
(6694, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX5]', '$MA_POS_LIMIT_MINUS', '-275.6', '5'),
(6695, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX5]', '$MA_POS_LIMIT_PLUS', '275.6', '5'),
(6696, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX5]', '$MA_GANTRY_AXIS_TYPE', '0', '5'),
(6697, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX6]', '$MA_NUM_ENCS', '1', '6'),
(6698, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX6]', '$MA_ENC_IS_LINEAR[0]', '0', '6'),
(6699, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX6]', '$MA_ENC_IS_LINEAR[1]', '0', '6'),
(6700, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX6]', '$MA_ENC_COMP_ENABLE[0]', '0', '6'),
(6701, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX6]', '$MA_ENC_COMP_ENABLE[1]', '0', '6'),
(6702, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX6]', '$MA_CEC_ENABLE', '0', '6'),
(6703, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX6]', '$MA_POS_LIMIT_MINUS', '-100000000', '6'),
(6704, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX6]', '$MA_POS_LIMIT_PLUS', '100000000', '6'),
(6705, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX6]', '$MA_GANTRY_AXIS_TYPE', '0', '6'),
(6706, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX7]', '$MA_NUM_ENCS', '1', '7'),
(6707, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX7]', '$MA_ENC_IS_LINEAR[0]', '1', '7'),
(6708, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX7]', '$MA_ENC_IS_LINEAR[1]', '0', '7'),
(6709, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX7]', '$MA_ENC_COMP_ENABLE[0]', '0', '7'),
(6710, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX7]', '$MA_ENC_COMP_ENABLE[1]', '0', '7'),
(6711, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX7]', '$MA_CEC_ENABLE', '1', '7'),
(6712, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX7]', '$MA_POS_LIMIT_MINUS', '-100000000', '7'),
(6713, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX7]', '$MA_POS_LIMIT_PLUS', '100000000', '7'),
(6714, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX7]', '$MA_GANTRY_AXIS_TYPE', '11', '7'),
(6715, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX11]', '$MA_NUM_ENCS', '1', '11'),
(6716, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX11]', '$MA_ENC_IS_LINEAR[0]', '0', '11'),
(6717, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX11]', '$MA_ENC_IS_LINEAR[1]', '0', '11'),
(6718, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX11]', '$MA_ENC_COMP_ENABLE[0]', '0', '11'),
(6719, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX11]', '$MA_ENC_COMP_ENABLE[1]', '0', '11'),
(6720, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX11]', '$MA_CEC_ENABLE', '0', '11'),
(6721, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX11]', '$MA_POS_LIMIT_MINUS', '-100000000', '11'),
(6722, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX11]', '$MA_POS_LIMIT_PLUS', '100000000', '11'),
(6723, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX11]', '$MA_GANTRY_AXIS_TYPE', '0', '11'),
(6724, '68319758', 'CHANDATA(1)', 'N30200', '$MA_NUM_ENCS[AX13]', '$MA_NUM_ENCS', '1', '13'),
(6725, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[0,AX13]', '$MA_ENC_IS_LINEAR[0]', '0', '13'),
(6726, '68319758', 'CHANDATA(1)', 'N31000', '$MA_ENC_IS_LINEAR[1,AX13]', '$MA_ENC_IS_LINEAR[1]', '0', '13'),
(6727, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[0,AX13]', '$MA_ENC_COMP_ENABLE[0]', '0', '13'),
(6728, '68319758', 'CHANDATA(1)', 'N32700', '$MA_ENC_COMP_ENABLE[1,AX13]', '$MA_ENC_COMP_ENABLE[1]', '0', '13'),
(6729, '68319758', 'CHANDATA(1)', 'N32710', '$MA_CEC_ENABLE[AX13]', '$MA_CEC_ENABLE', '0', '13'),
(6730, '68319758', 'CHANDATA(1)', 'N36100', '$MA_POS_LIMIT_MINUS[AX13]', '$MA_POS_LIMIT_MINUS', '-100000000', '13'),
(6731, '68319758', 'CHANDATA(1)', 'N36110', '$MA_POS_LIMIT_PLUS[AX13]', '$MA_POS_LIMIT_PLUS', '100000000', '13'),
(6732, '68319758', 'CHANDATA(1)', 'N37100', '$MA_GANTRY_AXIS_TYPE[AX13]', '$MA_GANTRY_AXIS_TYPE', '0', '13'),
(6733, '0ff2a06a', 'CHANDATA(1)', '-', '-', '-', '-', '-');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_col_size`
--

CREATE TABLE IF NOT EXISTS `tbl_col_size` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `count` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=90 ;

--
-- Dumping data for table `tbl_col_size`
--

INSERT INTO `tbl_col_size` (`Id`, `count`) VALUES
(89, '9');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_processed_table`
--

CREATE TABLE IF NOT EXISTS `tbl_processed_table` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `col1` varchar(100) NOT NULL,
  `col2` varchar(100) NOT NULL,
  `col3` varchar(100) NOT NULL,
  `col4` varchar(100) NOT NULL,
  `col5` varchar(100) NOT NULL,
  `col6` varchar(100) NOT NULL,
  `col7` varchar(100) NOT NULL,
  `col8` varchar(100) NOT NULL,
  `col9` varchar(100) NOT NULL,
  `col10` varchar(100) NOT NULL,
  `col11` varchar(100) NOT NULL,
  `col12` varchar(100) NOT NULL,
  `col13` varchar(100) NOT NULL,
  `col14` varchar(100) NOT NULL,
  `col15` varchar(100) NOT NULL,
  `col16` varchar(100) NOT NULL,
  `col17` varchar(100) NOT NULL,
  `col18` varchar(100) NOT NULL,
  `col19` varchar(100) NOT NULL,
  `col20` varchar(100) NOT NULL,
  `col21` varchar(100) NOT NULL,
  `col22` varchar(100) NOT NULL,
  `col23` varchar(100) NOT NULL,
  `col24` varchar(100) NOT NULL,
  `col25` varchar(100) NOT NULL,
  `col26` varchar(100) NOT NULL,
  `col27` varchar(100) NOT NULL,
  `col28` varchar(100) NOT NULL,
  `col29` varchar(100) NOT NULL,
  `col30` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=583 ;

--
-- Dumping data for table `tbl_processed_table`
--

INSERT INTO `tbl_processed_table` (`id`, `col1`, `col2`, `col3`, `col4`, `col5`, `col6`, `col7`, `col8`, `col9`, `col10`, `col11`, `col12`, `col13`, `col14`, `col15`, `col16`, `col17`, `col18`, `col19`, `col20`, `col21`, `col22`, `col23`, `col24`, `col25`, `col26`, `col27`, `col28`, `col29`, `col30`) VALUES
(568, '$MC_AXCONF_MACHAX_USED', '1', '2', '3', '4', '5', '6', '7', '11', '13', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(569, '$MN_AXCONF_MACHAX_NAME_TAB', '"X1"', '"Y1"', '"Z1"', '"A1"', '"C1"', '"SP1"', '"XF1"', '"ATCR1"', '"ATCG1"', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(570, '$MN_AXCONF_LOGIC_MACHAX_TAB', '"AX1"', '"AX2"', '"AX3"', '"AX4"', '"AX5"', '"AX6"', '"AX7"', '"AX11"', '"AX13"', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(571, '$MN_MM_CEC_MAX_POINTS', '16', '21', '25', '45', '73', '16', '16', '21', '25', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(572, '$MA_CEC_ENABLE', '1', '1', '1', '1', '1', '0', '1', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(573, '$MA_ENC_IS_LINEAR[0]', '1', '1', '1', '0', '0', '0', '1', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(574, '$MA_ENC_IS_LINEAR[1]', '0', '0', '0', '0', '0', '0', '0', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(575, '$MA_GANTRY_AXIS_TYPE', '1', '0', '0', '0', '0', '0', '11', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(576, '$MA_NUM_ENCS', '1', '1', '1', '1', '1', '1', '1', '1', '1', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(577, '$MA_ENC_COMP_ENABLE[0]', '0', '0', '0', '0', '0', '0', '0', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(578, '$MA_ENC_COMP_ENABLE[1]', '0', '0', '0', '0', '0', '0', '0', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(579, '$MA_POS_LIMIT_MINUS', '-0.6', '-0.6', '-0.6', '-110.6', '-275.6', '-100000000', '-100000000', '-100000000', '-100000000', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(580, '$MA_POS_LIMIT_PLUS', '1500.6', '2000.6', '1200.6', '110.6', '275.6', '100000000', '100000000', '100000000', '100000000', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(581, 'ENC Axis Comp active', '0', '0', '0', '0', '0', '0', '0', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''),
(582, 'CEC Axis Comp active', '1', '1', '1', '1', '1', '0', '1', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_raw_data`
--

CREATE TABLE IF NOT EXISTS `tbl_raw_data` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `session_code` varchar(100) NOT NULL,
  `Test_name` varchar(100) NOT NULL,
  `Table_type` varchar(100) NOT NULL,
  `Compensation_type` varchar(100) NOT NULL,
  `Compensation_resolution` varchar(100) NOT NULL,
  `Sign_convention` varchar(100) NOT NULL,
  `Reference_pos` varchar(100) NOT NULL,
  `Compensation_start` varchar(100) NOT NULL,
  `Compensation_end` varchar(100) NOT NULL,
  `Compensation_spacing` varchar(100) NOT NULL,
  `Backlash_error` varchar(100) NOT NULL,
  `Target_no` varchar(100) NOT NULL,
  `Axis_position` varchar(100) NOT NULL,
  `Forward_direction` varchar(100) NOT NULL,
  `Reverse_direction` varchar(100) NOT NULL,
  `Combined` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `tbl_raw_data`
--

INSERT INTO `tbl_raw_data` (`id`, `session_code`, `Test_name`, `Table_type`, `Compensation_type`, `Compensation_resolution`, `Sign_convention`, `Reference_pos`, `Compensation_start`, `Compensation_end`, `Compensation_spacing`, `Backlash_error`, `Target_no`, `Axis_position`, `Forward_direction`, `Reverse_direction`, `Combined`) VALUES
(1, '34FDGDFG78', 'X-Axis Position Accuracy ', 'Separate forward and reverse tables', 'Absolute', '1 mm ', 'As errors', '-250 mm', '-250 mm', '375 mm ', '25 mm ', 'N/A', '1', '-250', '0', '-0.0002', '0');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
