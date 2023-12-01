-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2021 at 03:31 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendant`
--

CREATE TABLE `attendant` (
  `EMP_NO` int(11) NOT NULL,
  `Hourly_rate` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendant`
--

INSERT INTO `attendant` (`EMP_NO`, `Hourly_rate`) VALUES
(10010, 100),
(10011, 120);

-- --------------------------------------------------------

--
-- Table structure for table `bed`
--

CREATE TABLE `bed` (
  `Bed_no` int(11) NOT NULL,
  `WardNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bed`
--

INSERT INTO `bed` (`Bed_no`, `WardNo`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(11, 2),
(12, 2),
(13, 2),
(14, 2),
(15, 2),
(16, 2),
(17, 2),
(18, 2),
(19, 2),
(20, 2),
(21, 3),
(22, 3),
(23, 3),
(24, 3),
(25, 3),
(26, 3),
(27, 3),
(28, 3),
(29, 3),
(30, 3);

-- --------------------------------------------------------

--
-- Table structure for table `cleaner`
--

CREATE TABLE `cleaner` (
  `EMP_NO` int(11) NOT NULL,
  `Contract_No` int(11) NOT NULL,
  `Start_date` date NOT NULL,
  `End_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cleaner`
--

INSERT INTO `cleaner` (`EMP_NO`, `Contract_No`, `Start_date`, `End_date`) VALUES
(10012, 200, '2008-08-08', '2025-02-08'),
(10013, 201, '2015-01-01', '2030-08-04');

-- --------------------------------------------------------

--
-- Table structure for table `daily_record`
--

CREATE TABLE `daily_record` (
  `Record_ID` int(11) NOT NULL,
  `InPatient_ID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Time` time NOT NULL,
  `Pulse` int(11) NOT NULL,
  `Blood_Pressure` float NOT NULL,
  `Weight` float NOT NULL,
  `Temperature` float NOT NULL,
  `NurseNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `daily_record`
--

INSERT INTO `daily_record` (`Record_ID`, `InPatient_ID`, `Date`, `Time`, `Pulse`, `Blood_Pressure`, `Weight`, `Temperature`, `NurseNo`) VALUES
(100, 1, '2021-10-02', '18:25:32', 74, 72.8, 60, 37, 10005),
(101, 2, '2021-10-02', '18:25:32', 76, 77, 79.9, 37.5, 10007),
(102, 3, '2021-10-02', '18:25:32', 69, 73.9, 50, 37, 10008),
(103, 3, '2021-10-02', '18:35:30', 70, 73.8, 50, 37, 10009);

-- --------------------------------------------------------

--
-- Table structure for table `daily_symptom`
--

CREATE TABLE `daily_symptom` (
  `Record_ID` int(11) NOT NULL,
  `Symptom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `daily_symptom`
--

INSERT INTO `daily_symptom` (`Record_ID`, `Symptom`) VALUES
(101, 'Fever'),
(102, 'Coughing'),
(102, 'Trouble Breathing'),
(103, 'Coughing');

-- --------------------------------------------------------

--
-- Table structure for table `diagnose`
--

CREATE TABLE `diagnose` (
  `Diagnose_Code` int(11) NOT NULL,
  `Diagnose_Name` varchar(20) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Diagnosis_Date` date NOT NULL,
  `Diagnosis_Time` time NOT NULL,
  `DoctorNo` int(11) NOT NULL,
  `PatientID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `diagnose`
--

INSERT INTO `diagnose` (`Diagnose_Code`, `Diagnose_Name`, `Description`, `Diagnosis_Date`, `Diagnosis_Time`, `DoctorNo`, `PatientID`) VALUES
(100, 'Brain Scan', '', '2021-10-02', '18:46:12', 10000, 1),
(101, 'cholecystography', 'Admit immediately', '2021-10-02', '18:46:12', 10004, 2);

-- --------------------------------------------------------

--
-- Table structure for table `diagnostic_unit`
--

CREATE TABLE `diagnostic_unit` (
  `Diag_No` int(11) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `PCUnit_No` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `diagnostic_unit`
--

INSERT INTO `diagnostic_unit` (`Diag_No`, `Name`, `PCUnit_No`) VALUES
(1, 'Cardiac Unit', 5),
(2, 'Clinical lab', 6);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `EMP_NO` int(11) NOT NULL,
  `DEA_No` int(11) NOT NULL,
  `Area_of_Specialty` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`EMP_NO`, `DEA_No`, `Area_of_Specialty`) VALUES
(10000, 2000, ''),
(10001, 2001, ''),
(10002, 2003, ''),
(10003, 2002, 'Eye'),
(10004, 2004, '');

-- --------------------------------------------------------

--
-- Stand-in structure for view `doctor_info`
-- (See below for the actual view)
--
CREATE TABLE `doctor_info` (
`EMP_NO` int(11)
,`Name` varchar(50)
,`Address` varchar(50)
,`Contact_No` int(11)
,`Status` varchar(10)
,`EmpType` varchar(10)
,`MC_Reg_no` int(11)
,`joined_date` date
,`resigned_date` date
,`DEA_No` int(11)
,`Area_of_Specialty` char(10)
);

-- --------------------------------------------------------

--
-- Table structure for table `doctor_performtreatment_patient`
--

CREATE TABLE `doctor_performtreatment_patient` (
  `DoctorID` int(11) NOT NULL,
  `PatientID` int(11) NOT NULL,
  `TreatmentID` int(11) NOT NULL,
  `Treatment_Date` date NOT NULL,
  `Treatment_Time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor_performtreatment_patient`
--

INSERT INTO `doctor_performtreatment_patient` (`DoctorID`, `PatientID`, `TreatmentID`, `Treatment_Date`, `Treatment_Time`) VALUES
(10002, 4, 500, '2021-10-02', '18:53:51'),
(10003, 2, 505, '2021-10-02', '18:53:51');

-- --------------------------------------------------------

--
-- Table structure for table `drug`
--

CREATE TABLE `drug` (
  `DrugCode` int(11) NOT NULL,
  `Drug_Name` varchar(10) NOT NULL,
  `DrugType` char(8) NOT NULL CHECK (`DrugType` in ('Tablet','Liquid')),
  `Unit_Cost` int(11) NOT NULL,
  `Treatment_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `drug`
--

INSERT INTO `drug` (`DrugCode`, `Drug_Name`, `DrugType`, `Unit_Cost`, `Treatment_ID`) VALUES
(5000, 'Panadol', 'tablet', 20, 500),
(5001, 'Vitamin C', 'tablet', 10, 501),
(5002, 'Ascoril', 'liquid', 175, 501),
(5003, 'Antiviral', 'liquid', 250, 501);

-- --------------------------------------------------------

--
-- Table structure for table `emergency_contact_info`
--

CREATE TABLE `emergency_contact_info` (
  `InPatientID` int(11) NOT NULL,
  `FName` varchar(10) NOT NULL,
  `LName` varchar(15) NOT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `ContactNo` int(11) NOT NULL,
  `Relationship` char(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emergency_contact_info`
--

INSERT INTO `emergency_contact_info` (`InPatientID`, `FName`, `LName`, `Address`, `ContactNo`, `Relationship`) VALUES
(1, 'Dilshan', 'Karunaratne', 'Gampaha', 775896985, 'Father'),
(2, 'Wasana', 'Kulathunga', 'Colombo', 112741852, 'Mother'),
(3, 'Asela', 'Perera', 'Ja-Ela', 774586321, 'Father'),
(3, 'Sadun', 'Perera', 'Ja-Ela', 774888821, 'Brother');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EMP_NO` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Contact_No` int(11) DEFAULT NULL,
  `Status` varchar(10) NOT NULL CHECK (`Status` = 'full' or `Status` = 'part'),
  `EmpType` varchar(10) NOT NULL CHECK (`EmpType` = 'Medical' or `EmpType` = 'NonMedical')
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EMP_NO`, `Name`, `Address`, `Contact_No`, `Status`, `EmpType`) VALUES
(10000, 'Ajantha Mendis', 'Maharagama', 852169417, 'Full', 'Medical'),
(10001, 'Anil Jayamanna', 'Kandy', 758962141, 'Full', 'Medical'),
(10002, 'Kasuni Perera', 'Malambe', 772589634, 'Part', 'Medical'),
(10003, 'Kanil Karunaratne', 'Nugegoda', 718523694, 'Part', 'Medical'),
(10004, 'Supun Peiris', 'Anuradhapura', 728521476, 'Full', 'Medical'),
(10005, 'Anil Wimalaratne', 'Polonnaruwa', 773214568, 'Full', 'Medical'),
(10006, 'Thilini Siriwardhene', 'Colombo', 771285314, 'Full', 'Medical'),
(10007, 'Ruwan Gunawardhene', 'Galle', 719517535, 'Part', 'Medical'),
(10008, 'Kumara De Silva', 'Homagama', 714566542, 'Full', 'Medical'),
(10009, 'Nimali Hansani', 'Sri Jayawardhanapura', 738499871, 'Full', 'Medical'),
(10010, 'Ravindu Wijethilaka', 'Kiribathgoda', 774569366, 'Full', 'Nonmedical'),
(10011, 'Upul Fonseka', 'Kaluthara', 771477412, 'Part', 'Nonmedical'),
(10012, 'Isuru Perera', 'Nawalapitiya', 725896545, 'Full', 'Nonmedical'),
(10013, 'Piyal Rajapaksha', 'Dambulla', 772563148, 'Part', 'Nonmedical');

-- --------------------------------------------------------

--
-- Table structure for table `employee_assign_patientcare`
--

CREATE TABLE `employee_assign_patientcare` (
  `EMP_NO` int(11) NOT NULL,
  `PCUnit_No` int(11) NOT NULL,
  `Hours_Per_Week` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee_assign_patientcare`
--

INSERT INTO `employee_assign_patientcare` (`EMP_NO`, `PCUnit_No`, `Hours_Per_Week`) VALUES
(10000, 1, 20),
(10001, 2, 25),
(10002, 2, 30),
(10003, 1, 22),
(10004, 3, 26),
(10005, 1, 80),
(10006, 2, 88),
(10007, 3, 82),
(10008, 3, 75),
(10009, 2, 81),
(10010, 1, 60),
(10011, 2, 65),
(10012, 1, 70),
(10013, 3, 66);

-- --------------------------------------------------------

--
-- Stand-in structure for view `inpatient_info`
-- (See below for the actual view)
--
CREATE TABLE `inpatient_info` (
`patient_id` int(11)
,`Name` varchar(25)
,`Birth_Date` date
,`Admit_Date` date
,`Admit_Time` time
,`Discharge_Date` date
,`Discharge_Time` time
,`Insurance_Company` varchar(15)
,`I_BranchName` varchar(15)
,`PrimaryDoctor_No` int(11)
,`WardNo` int(11)
,`BedNo` int(11)
);

-- --------------------------------------------------------

--
-- Table structure for table `insurance_branch`
--

CREATE TABLE `insurance_branch` (
  `Company_Name` varchar(15) NOT NULL,
  `Branch_Name` varchar(15) NOT NULL,
  `Branch_Address` varchar(50) DEFAULT NULL,
  `Branch_Contact_No` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `insurance_branch`
--

INSERT INTO `insurance_branch` (`Company_Name`, `Branch_Name`, `Branch_Address`, `Branch_Contact_No`) VALUES
('AIA', 'AIA_Colombo', 'Colombo', 112310310),
('AIA', 'AIA_Kandy', 'Kandy', 812200100),
('AIA', 'AIA_Kurunegala', 'Kurunegala', 372223540),
('AIG', 'AIG_Colombo', 'Colombo', 112837611),
('AIG', 'AIG_Kandy', 'Kandy', 812200109),
('Allianz', 'Allianz_Kandy', 'Kandy', 814403300),
('Allianz', 'Allianz_Maharag', 'Maharagama', 112837611),
('Allianz', 'Allianz_Main', 'Colombo', 112314312),
('Ceylinco', 'Ceylinco_Main', 'Kandy', 377223546),
('Ceylinco', 'Cey_Kurunegala', 'Kurunegala', 372553544),
('LOLC', 'LOLC_Dehiwala', 'Dehiwala', 812400330),
('LOLC', 'LOLC_Main', 'Kurunegala', 372443543),
('Softlogic', 'Softlogic_Kandy', 'Kandy', 812445121),
('Softlogic', 'Softlogic_Main', 'Colombo', 112447622);

-- --------------------------------------------------------

--
-- Table structure for table `insurance_company`
--

CREATE TABLE `insurance_company` (
  `Company_Name` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `insurance_company`
--

INSERT INTO `insurance_company` (`Company_Name`) VALUES
('AIA'),
('AIG'),
('Allianz'),
('Ceylinco'),
('LOLC'),
('Softlogic');

-- --------------------------------------------------------

--
-- Table structure for table `insurance_subscriber`
--

CREATE TABLE `insurance_subscriber` (
  `InPatientID` int(11) NOT NULL,
  `FName` varchar(10) NOT NULL,
  `LName` varchar(10) NOT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `ContactNo` int(11) NOT NULL,
  `Relationship` char(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `insurance_subscriber`
--

INSERT INTO `insurance_subscriber` (`InPatientID`, `FName`, `LName`, `Address`, `ContactNo`, `Relationship`) VALUES
(3, 'Asela', 'Perera', 'Ja-Ela', 774586321, 'Father');

-- --------------------------------------------------------

--
-- Table structure for table `in_patient`
--

CREATE TABLE `in_patient` (
  `Patient_ID` int(11) NOT NULL,
  `Birth_Date` date NOT NULL,
  `Admit_Date` date NOT NULL,
  `Admit_Time` time NOT NULL,
  `Discharge_Date` date DEFAULT NULL,
  `Discharge_Time` time DEFAULT NULL,
  `Insurance_Company` varchar(15) DEFAULT NULL,
  `I_BranchName` varchar(15) DEFAULT NULL,
  `WardNo` int(11) NOT NULL,
  `BedNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `in_patient`
--

INSERT INTO `in_patient` (`Patient_ID`, `Birth_Date`, `Admit_Date`, `Admit_Time`, `Discharge_Date`, `Discharge_Time`, `Insurance_Company`, `I_BranchName`, `WardNo`, `BedNo`) VALUES
(1, '1998-04-08', '2021-10-02', '18:01:48', NULL, NULL, NULL, NULL, 1, 1),
(2, '2003-11-15', '2021-10-02', '18:07:06', NULL, NULL, 'Ceylinco', 'Cey_Kurunegala', 1, 2),
(3, '1991-07-20', '2021-10-02', '18:11:54', '2021-05-05', '14:30:22', 'AIA', 'AIA_Colombo', 2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `medical_staff`
--

CREATE TABLE `medical_staff` (
  `EMP_NO` int(11) NOT NULL,
  `MC_Reg_no` int(11) NOT NULL,
  `joined_date` date NOT NULL,
  `resigned_date` date DEFAULT NULL,
  `Medical_Type` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medical_staff`
--

INSERT INTO `medical_staff` (`EMP_NO`, `MC_Reg_no`, `joined_date`, `resigned_date`, `Medical_Type`) VALUES
(10000, 400, '1990-03-05', NULL, 'Doctor'),
(10001, 401, '2000-04-01', NULL, 'Doctor'),
(10002, 403, '2021-05-05', NULL, 'Doctor'),
(10003, 402, '2020-10-05', NULL, 'Doctor'),
(10004, 404, '2004-09-05', NULL, 'Doctor'),
(10005, 405, '2003-05-22', NULL, 'Nurse'),
(10006, 406, '2005-08-09', '2019-10-30', 'Nurse'),
(10007, 407, '2019-12-09', NULL, 'Nurse'),
(10008, 408, '2002-05-09', NULL, 'Nurse'),
(10009, 409, '2007-06-22', NULL, 'Nurse');

-- --------------------------------------------------------

--
-- Table structure for table `non_medical_staff`
--

CREATE TABLE `non_medical_staff` (
  `EMP_NO` int(11) NOT NULL,
  `NonMedical_Type` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `non_medical_staff`
--

INSERT INTO `non_medical_staff` (`EMP_NO`, `NonMedical_Type`) VALUES
(10010, 'Attendant'),
(10011, 'Attendant'),
(10012, 'Cleaner'),
(10013, 'Cleaner');

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `EMP_NO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`EMP_NO`) VALUES
(10005),
(10006),
(10007),
(10008),
(10009);

-- --------------------------------------------------------

--
-- Stand-in structure for view `nurse_info`
-- (See below for the actual view)
--
CREATE TABLE `nurse_info` (
`EMP_NO` int(11)
,`Name` varchar(50)
,`Address` varchar(50)
,`Contact_No` int(11)
,`Status` varchar(10)
,`EmpType` varchar(10)
,`MC_Reg_no` int(11)
,`joined_date` date
,`resigned_date` date
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `outpatient_info`
-- (See below for the actual view)
--
CREATE TABLE `outpatient_info` (
`Patient_ID` int(11)
,`Name` varchar(25)
,`OPD_Date` date
,`OPD_Time` time
);

-- --------------------------------------------------------

--
-- Table structure for table `out_patient`
--

CREATE TABLE `out_patient` (
  `Patient_ID` int(11) NOT NULL,
  `OPD_Date` date NOT NULL,
  `OPD_Time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `out_patient`
--

INSERT INTO `out_patient` (`Patient_ID`, `OPD_Date`, `OPD_Time`) VALUES
(4, '2021-10-02', '18:14:57'),
(5, '2021-10-02', '18:16:14'),
(6, '2021-10-26', '16:22:11');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `Patient_ID` int(11) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `PatientType` varchar(15) NOT NULL,
  `FRecordDate` date NOT NULL,
  `FRecordTime` time NOT NULL,
  `Weight` float NOT NULL,
  `Blood_Pressure` float NOT NULL,
  `Temperature` float NOT NULL,
  `Pulse` int(11) NOT NULL,
  `NurseNo` int(11) NOT NULL,
  `PrimaryDoctor_No` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`Patient_ID`, `Name`, `PatientType`, `FRecordDate`, `FRecordTime`, `Weight`, `Blood_Pressure`, `Temperature`, `Pulse`, `NurseNo`, `PrimaryDoctor_No`) VALUES
(1, 'Kasun Silva', 'In_Patient', '2021-10-02', '17:47:19', 60, 73, 36.8, 70, 10005, 10001),
(2, 'Yasiru Jayasuriya', 'In_Patient', '2021-10-02', '18:05:35', 80, 77, 37.8, 76, 10007, 10004),
(3, 'Sachini Perera', 'In_Patient', '2021-10-02', '18:05:35', 50, 74, 37, 68, 10009, 10002),
(4, 'Kalana Wijesuriya', 'Out_Patient', '2021-10-02', '18:05:35', 66, 73, 37, 72, 10008, NULL),
(5, 'Thimira Gamage', 'Out_Patient', '2021-10-02', '18:05:35', 88, 74.5, 38.5, 73, 10008, NULL),
(6, 'Nadun Jayasinghe', 'Out_Patient', '2021-10-02', '18:05:35', 71, 70, 39, 75, 10009, NULL);

-- --------------------------------------------------------

--
-- Stand-in structure for view `patientcare`
-- (See below for the actual view)
--
CREATE TABLE `patientcare` (
`PatientCareUnit_No` int(11)
,`PCType` varchar(10)
,`Incharge_EmpNo` int(11)
,`Ward_Name` varchar(15)
,`WardNo` int(11)
,`Diag_No` int(11)
,`Diagnostic_Name` varchar(15)
);

-- --------------------------------------------------------

--
-- Table structure for table `patient_care_unit`
--

CREATE TABLE `patient_care_unit` (
  `PatientCareUnit_No` int(11) NOT NULL,
  `PCType` varchar(10) NOT NULL,
  `Incharge_EmpNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient_care_unit`
--

INSERT INTO `patient_care_unit` (`PatientCareUnit_No`, `PCType`, `Incharge_EmpNo`) VALUES
(1, 'Ward', 10000),
(2, 'Ward', 10001),
(3, 'Ward', 10004),
(4, 'Ward', 10002),
(5, 'Diagnostic', 10003),
(6, 'Diagnostic', 10002);

-- --------------------------------------------------------

--
-- Table structure for table `patient_first_symptom`
--

CREATE TABLE `patient_first_symptom` (
  `Patient_ID` int(11) NOT NULL,
  `Symptom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient_first_symptom`
--

INSERT INTO `patient_first_symptom` (`Patient_ID`, `Symptom`) VALUES
(2, 'Fever'),
(3, 'Headache'),
(3, 'Trouble Breathing'),
(5, 'Coughing'),
(6, 'Coughing'),
(6, 'Fever');

-- --------------------------------------------------------

--
-- Stand-in structure for view `patient_record`
-- (See below for the actual view)
--
CREATE TABLE `patient_record` (
`Patient_ID` int(11)
,`FRecordDate` date
,`FRecordTime` time
,`Weight` float
,`Blood_Pressure` float
,`Temperature` float
,`Pulse` int(11)
,`NurseNo` int(11)
,`Symptom` varchar(20)
);

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `TestCode` int(11) NOT NULL,
  `TestName` varchar(20) NOT NULL,
  `Cost` int(11) DEFAULT NULL,
  `Treatment_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`TestCode`, `TestName`, `Cost`, `Treatment_ID`) VALUES
(100, 'Lipid Profile', 250, 504),
(101, 'X-Ray', 500, 505),
(102, 'MRI', 750, 506),
(103, 'CBC', 1000, 507),
(104, 'Liver Function', 2450, 508);

-- --------------------------------------------------------

--
-- Table structure for table `treatment`
--

CREATE TABLE `treatment` (
  `Treatment_ID` int(11) NOT NULL,
  `Treatment_Type` char(4) NOT NULL CHECK (`Treatment_Type` in ('Test','Drug'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `treatment`
--

INSERT INTO `treatment` (`Treatment_ID`, `Treatment_Type`) VALUES
(500, 'drug'),
(501, 'drug'),
(502, 'drug'),
(503, 'drug'),
(504, 'test'),
(505, 'test'),
(506, 'test'),
(507, 'test'),
(508, 'test');

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `RegNo` int(11) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `Address` varchar(25) NOT NULL,
  `Contact_No` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`RegNo`, `Name`, `Address`, `Contact_No`) VALUES
(3000, 'XYZ Vendors', 'Colombo', 112756984),
(3001, 'ABC Vendors', 'Rathnapura', 112666974),
(3002, 'Lanka Medicine ', 'Maradana', 112974441),
(3003, 'JKL Importers', 'Colombo', 112555441);

-- --------------------------------------------------------

--
-- Stand-in structure for view `vendor_supply`
-- (See below for the actual view)
--
CREATE TABLE `vendor_supply` (
`Supply_ID` int(11)
,`VendorID` int(11)
,`DrugCode` int(11)
,`Supplied_Date` date
,`Quantity` int(11)
,`Total_Cost` bigint(21)
);

-- --------------------------------------------------------

--
-- Table structure for table `vendor_supply_drug`
--

CREATE TABLE `vendor_supply_drug` (
  `Supply_ID` int(11) NOT NULL,
  `VendorID` int(11) NOT NULL,
  `DrugCode` int(11) NOT NULL,
  `Supplied_Date` date NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vendor_supply_drug`
--

INSERT INTO `vendor_supply_drug` (`Supply_ID`, `VendorID`, `DrugCode`, `Supplied_Date`, `Quantity`) VALUES
(100, 3000, 5000, '2013-06-20', 3500),
(101, 3001, 5001, '2015-10-16', 2500),
(102, 3002, 5002, '2018-05-26', 1000),
(103, 3003, 5003, '2020-03-13', 800);

-- --------------------------------------------------------

--
-- Table structure for table `ward`
--

CREATE TABLE `ward` (
  `Ward_No` int(11) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `PCUnit_No` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ward`
--

INSERT INTO `ward` (`Ward_No`, `Name`, `PCUnit_No`) VALUES
(1, 'General', 1),
(2, 'Cardiology', 2),
(3, 'Neurology', 3),
(4, 'Dialysis', 4);

-- --------------------------------------------------------

--
-- Structure for view `doctor_info`
--
DROP TABLE IF EXISTS `doctor_info`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `doctor_info`  AS SELECT `e`.`EMP_NO` AS `EMP_NO`, `e`.`Name` AS `Name`, `e`.`Address` AS `Address`, `e`.`Contact_No` AS `Contact_No`, `e`.`Status` AS `Status`, `e`.`EmpType` AS `EmpType`, `m`.`MC_Reg_no` AS `MC_Reg_no`, `m`.`joined_date` AS `joined_date`, `m`.`resigned_date` AS `resigned_date`, `d`.`DEA_No` AS `DEA_No`, `d`.`Area_of_Specialty` AS `Area_of_Specialty` FROM ((`employee` `e` join `medical_staff` `m` on(`m`.`Medical_Type` = 'Doctor' and `m`.`EMP_NO` = `e`.`EMP_NO`)) join `doctor` `d` on(`d`.`EMP_NO` = `e`.`EMP_NO`)) ;

-- --------------------------------------------------------

--
-- Structure for view `inpatient_info`
--
DROP TABLE IF EXISTS `inpatient_info`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `inpatient_info`  AS SELECT `p`.`Patient_ID` AS `patient_id`, `p`.`Name` AS `Name`, `ip`.`Birth_Date` AS `Birth_Date`, `ip`.`Admit_Date` AS `Admit_Date`, `ip`.`Admit_Time` AS `Admit_Time`, `ip`.`Discharge_Date` AS `Discharge_Date`, `ip`.`Discharge_Time` AS `Discharge_Time`, `ip`.`Insurance_Company` AS `Insurance_Company`, `ip`.`I_BranchName` AS `I_BranchName`, `p`.`PrimaryDoctor_No` AS `PrimaryDoctor_No`, `ip`.`WardNo` AS `WardNo`, `ip`.`BedNo` AS `BedNo` FROM (`patient` `p` join `in_patient` `ip` on(`p`.`Patient_ID` = `ip`.`Patient_ID`)) WHERE `p`.`PatientType` = 'In_Patient' ;

-- --------------------------------------------------------

--
-- Structure for view `nurse_info`
--
DROP TABLE IF EXISTS `nurse_info`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `nurse_info`  AS SELECT `e`.`EMP_NO` AS `EMP_NO`, `e`.`Name` AS `Name`, `e`.`Address` AS `Address`, `e`.`Contact_No` AS `Contact_No`, `e`.`Status` AS `Status`, `e`.`EmpType` AS `EmpType`, `m`.`MC_Reg_no` AS `MC_Reg_no`, `m`.`joined_date` AS `joined_date`, `m`.`resigned_date` AS `resigned_date` FROM (`employee` `e` join `medical_staff` `m`) WHERE `m`.`Medical_Type` = 'Nurse' AND `m`.`EMP_NO` = `e`.`EMP_NO` ;

-- --------------------------------------------------------

--
-- Structure for view `outpatient_info`
--
DROP TABLE IF EXISTS `outpatient_info`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `outpatient_info`  AS SELECT `p`.`Patient_ID` AS `Patient_ID`, `p`.`Name` AS `Name`, `op`.`OPD_Date` AS `OPD_Date`, `op`.`OPD_Time` AS `OPD_Time` FROM (`patient` `p` join `out_patient` `op` on(`p`.`Patient_ID` = `op`.`Patient_ID`)) WHERE `p`.`PatientType` = 'Out_Patient' ;

-- --------------------------------------------------------

--
-- Structure for view `patientcare`
--
DROP TABLE IF EXISTS `patientcare`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `patientcare`  AS SELECT `p`.`PatientCareUnit_No` AS `PatientCareUnit_No`, `p`.`PCType` AS `PCType`, `p`.`Incharge_EmpNo` AS `Incharge_EmpNo`, `w`.`Name` AS `Ward_Name`, `w`.`Ward_No` AS `WardNo`, `d`.`Diag_No` AS `Diag_No`, `d`.`Name` AS `Diagnostic_Name` FROM ((`patient_care_unit` `p` left join `ward` `w` on(`p`.`PatientCareUnit_No` = `w`.`PCUnit_No`)) left join `diagnostic_unit` `d` on(`d`.`PCUnit_No` = `p`.`PatientCareUnit_No`)) ;

-- --------------------------------------------------------

--
-- Structure for view `patient_record`
--
DROP TABLE IF EXISTS `patient_record`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `patient_record`  AS SELECT `p`.`Patient_ID` AS `Patient_ID`, `p`.`FRecordDate` AS `FRecordDate`, `p`.`FRecordTime` AS `FRecordTime`, `p`.`Weight` AS `Weight`, `p`.`Blood_Pressure` AS `Blood_Pressure`, `p`.`Temperature` AS `Temperature`, `p`.`Pulse` AS `Pulse`, `p`.`NurseNo` AS `NurseNo`, `s`.`Symptom` AS `Symptom` FROM (((`patient` `p` left join `in_patient` `ip` on(`p`.`Patient_ID` = `ip`.`Patient_ID`)) left join `out_patient` `op` on(`p`.`Patient_ID` = `op`.`Patient_ID`)) left join `patient_first_symptom` `s` on(`p`.`Patient_ID` = `s`.`Patient_ID`)) ;

-- --------------------------------------------------------

--
-- Structure for view `vendor_supply`
--
DROP TABLE IF EXISTS `vendor_supply`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vendor_supply`  AS SELECT `v`.`Supply_ID` AS `Supply_ID`, `v`.`VendorID` AS `VendorID`, `v`.`DrugCode` AS `DrugCode`, `v`.`Supplied_Date` AS `Supplied_Date`, `v`.`Quantity` AS `Quantity`, `v`.`Quantity`* `d`.`Unit_Cost` AS `Total_Cost` FROM (`vendor_supply_drug` `v` join `drug` `d`) WHERE `v`.`DrugCode` = `d`.`DrugCode` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendant`
--
ALTER TABLE `attendant`
  ADD PRIMARY KEY (`EMP_NO`);

--
-- Indexes for table `bed`
--
ALTER TABLE `bed`
  ADD PRIMARY KEY (`Bed_no`),
  ADD KEY `bed_ibfk_1` (`WardNo`);

--
-- Indexes for table `cleaner`
--
ALTER TABLE `cleaner`
  ADD PRIMARY KEY (`EMP_NO`),
  ADD UNIQUE KEY `Contract_No` (`Contract_No`);

--
-- Indexes for table `daily_record`
--
ALTER TABLE `daily_record`
  ADD PRIMARY KEY (`Record_ID`),
  ADD KEY `InPatient_ID` (`InPatient_ID`),
  ADD KEY `NurseNo` (`NurseNo`);

--
-- Indexes for table `daily_symptom`
--
ALTER TABLE `daily_symptom`
  ADD PRIMARY KEY (`Record_ID`,`Symptom`);

--
-- Indexes for table `diagnose`
--
ALTER TABLE `diagnose`
  ADD PRIMARY KEY (`Diagnose_Code`),
  ADD KEY `diagnose_ibfk_1` (`DoctorNo`),
  ADD KEY `diagnose_ibfk_2` (`PatientID`);

--
-- Indexes for table `diagnostic_unit`
--
ALTER TABLE `diagnostic_unit`
  ADD PRIMARY KEY (`Diag_No`),
  ADD KEY `PCUnit_No` (`PCUnit_No`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`EMP_NO`),
  ADD UNIQUE KEY `DEA_No` (`DEA_No`);

--
-- Indexes for table `doctor_performtreatment_patient`
--
ALTER TABLE `doctor_performtreatment_patient`
  ADD PRIMARY KEY (`DoctorID`,`PatientID`,`TreatmentID`),
  ADD KEY `doctor_performtreatment_patient_ibfk_2` (`PatientID`),
  ADD KEY `doctor_performtreatment_patient_ibfk_3` (`TreatmentID`);

--
-- Indexes for table `drug`
--
ALTER TABLE `drug`
  ADD PRIMARY KEY (`DrugCode`),
  ADD KEY `Treatment_ID` (`Treatment_ID`);

--
-- Indexes for table `emergency_contact_info`
--
ALTER TABLE `emergency_contact_info`
  ADD PRIMARY KEY (`InPatientID`,`FName`,`LName`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EMP_NO`);

--
-- Indexes for table `employee_assign_patientcare`
--
ALTER TABLE `employee_assign_patientcare`
  ADD PRIMARY KEY (`EMP_NO`,`PCUnit_No`),
  ADD KEY `PCUnit_No` (`PCUnit_No`);

--
-- Indexes for table `insurance_branch`
--
ALTER TABLE `insurance_branch`
  ADD PRIMARY KEY (`Company_Name`,`Branch_Name`);

--
-- Indexes for table `insurance_company`
--
ALTER TABLE `insurance_company`
  ADD PRIMARY KEY (`Company_Name`);

--
-- Indexes for table `insurance_subscriber`
--
ALTER TABLE `insurance_subscriber`
  ADD PRIMARY KEY (`InPatientID`,`FName`,`LName`);

--
-- Indexes for table `in_patient`
--
ALTER TABLE `in_patient`
  ADD PRIMARY KEY (`Patient_ID`),
  ADD UNIQUE KEY `BedNo` (`BedNo`),
  ADD KEY `in_patient_ibfk_2` (`Insurance_Company`,`I_BranchName`),
  ADD KEY `in_patient_ibfk_3` (`WardNo`),
  ADD KEY `in_patient_ibfk_4` (`BedNo`);

--
-- Indexes for table `medical_staff`
--
ALTER TABLE `medical_staff`
  ADD PRIMARY KEY (`EMP_NO`),
  ADD UNIQUE KEY `MC_Reg_no` (`MC_Reg_no`);

--
-- Indexes for table `non_medical_staff`
--
ALTER TABLE `non_medical_staff`
  ADD PRIMARY KEY (`EMP_NO`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`EMP_NO`);

--
-- Indexes for table `out_patient`
--
ALTER TABLE `out_patient`
  ADD PRIMARY KEY (`Patient_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`Patient_ID`),
  ADD KEY `patient_ibfk_1` (`NurseNo`),
  ADD KEY `patient_ibfk_2` (`PrimaryDoctor_No`);

--
-- Indexes for table `patient_care_unit`
--
ALTER TABLE `patient_care_unit`
  ADD PRIMARY KEY (`PatientCareUnit_No`),
  ADD KEY `Incharge_EmpNo` (`Incharge_EmpNo`);

--
-- Indexes for table `patient_first_symptom`
--
ALTER TABLE `patient_first_symptom`
  ADD PRIMARY KEY (`Patient_ID`,`Symptom`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`TestCode`),
  ADD KEY `Treatment_ID` (`Treatment_ID`);

--
-- Indexes for table `treatment`
--
ALTER TABLE `treatment`
  ADD PRIMARY KEY (`Treatment_ID`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`RegNo`);

--
-- Indexes for table `vendor_supply_drug`
--
ALTER TABLE `vendor_supply_drug`
  ADD PRIMARY KEY (`Supply_ID`),
  ADD KEY `VendorID` (`VendorID`),
  ADD KEY `DrugCode` (`DrugCode`);

--
-- Indexes for table `ward`
--
ALTER TABLE `ward`
  ADD PRIMARY KEY (`Ward_No`),
  ADD KEY `PCUnit_No` (`PCUnit_No`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendant`
--
ALTER TABLE `attendant`
  ADD CONSTRAINT `attendant_ibfk_1` FOREIGN KEY (`EMP_NO`) REFERENCES `non_medical_staff` (`EMP_NO`);

--
-- Constraints for table `bed`
--
ALTER TABLE `bed`
  ADD CONSTRAINT `bed_ibfk_1` FOREIGN KEY (`WardNo`) REFERENCES `ward` (`Ward_No`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `cleaner`
--
ALTER TABLE `cleaner`
  ADD CONSTRAINT `cleaner_ibfk_1` FOREIGN KEY (`EMP_NO`) REFERENCES `non_medical_staff` (`EMP_NO`);

--
-- Constraints for table `daily_record`
--
ALTER TABLE `daily_record`
  ADD CONSTRAINT `daily_record_ibfk_1` FOREIGN KEY (`InPatient_ID`) REFERENCES `in_patient` (`Patient_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `daily_record_ibfk_2` FOREIGN KEY (`NurseNo`) REFERENCES `nurse` (`EMP_NO`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `daily_symptom`
--
ALTER TABLE `daily_symptom`
  ADD CONSTRAINT `daily_symptom_ibfk_1` FOREIGN KEY (`Record_ID`) REFERENCES `daily_record` (`Record_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `diagnose`
--
ALTER TABLE `diagnose`
  ADD CONSTRAINT `diagnose_ibfk_1` FOREIGN KEY (`DoctorNo`) REFERENCES `doctor` (`EMP_NO`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `diagnose_ibfk_2` FOREIGN KEY (`PatientID`) REFERENCES `patient` (`Patient_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `diagnostic_unit`
--
ALTER TABLE `diagnostic_unit`
  ADD CONSTRAINT `diagnostic_unit_ibfk_1` FOREIGN KEY (`PCUnit_No`) REFERENCES `patient_care_unit` (`PatientCareUnit_No`);

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`EMP_NO`) REFERENCES `medical_staff` (`EMP_NO`);

--
-- Constraints for table `doctor_performtreatment_patient`
--
ALTER TABLE `doctor_performtreatment_patient`
  ADD CONSTRAINT `doctor_performtreatment_patient_ibfk_1` FOREIGN KEY (`DoctorID`) REFERENCES `doctor` (`EMP_NO`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `doctor_performtreatment_patient_ibfk_2` FOREIGN KEY (`PatientID`) REFERENCES `patient` (`Patient_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `doctor_performtreatment_patient_ibfk_3` FOREIGN KEY (`TreatmentID`) REFERENCES `treatment` (`Treatment_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `drug`
--
ALTER TABLE `drug`
  ADD CONSTRAINT `drug_ibfk_1` FOREIGN KEY (`Treatment_ID`) REFERENCES `treatment` (`Treatment_ID`);

--
-- Constraints for table `emergency_contact_info`
--
ALTER TABLE `emergency_contact_info`
  ADD CONSTRAINT `emergency_contact_info_ibfk_1` FOREIGN KEY (`InPatientID`) REFERENCES `in_patient` (`Patient_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `employee_assign_patientcare`
--
ALTER TABLE `employee_assign_patientcare`
  ADD CONSTRAINT `employee_assign_patientcare_ibfk_1` FOREIGN KEY (`EMP_NO`) REFERENCES `employee` (`EMP_NO`),
  ADD CONSTRAINT `employee_assign_patientcare_ibfk_2` FOREIGN KEY (`PCUnit_No`) REFERENCES `patient_care_unit` (`PatientCareUnit_No`);

--
-- Constraints for table `insurance_branch`
--
ALTER TABLE `insurance_branch`
  ADD CONSTRAINT `insurance_branch_ibfk_1` FOREIGN KEY (`Company_Name`) REFERENCES `insurance_company` (`Company_Name`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `insurance_subscriber`
--
ALTER TABLE `insurance_subscriber`
  ADD CONSTRAINT `insurance_subscriber_ibfk_1` FOREIGN KEY (`InPatientID`) REFERENCES `in_patient` (`Patient_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `in_patient`
--
ALTER TABLE `in_patient`
  ADD CONSTRAINT `in_patient_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  ADD CONSTRAINT `in_patient_ibfk_2` FOREIGN KEY (`Insurance_Company`,`I_BranchName`) REFERENCES `insurance_branch` (`Company_Name`, `Branch_Name`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `in_patient_ibfk_3` FOREIGN KEY (`WardNo`) REFERENCES `ward` (`Ward_No`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `in_patient_ibfk_4` FOREIGN KEY (`BedNo`) REFERENCES `bed` (`Bed_no`) ON UPDATE CASCADE;

--
-- Constraints for table `medical_staff`
--
ALTER TABLE `medical_staff`
  ADD CONSTRAINT `medical_staff_ibfk_1` FOREIGN KEY (`EMP_NO`) REFERENCES `employee` (`EMP_NO`);

--
-- Constraints for table `non_medical_staff`
--
ALTER TABLE `non_medical_staff`
  ADD CONSTRAINT `non_medical_staff_ibfk_1` FOREIGN KEY (`EMP_NO`) REFERENCES `employee` (`EMP_NO`);

--
-- Constraints for table `nurse`
--
ALTER TABLE `nurse`
  ADD CONSTRAINT `nurse_ibfk_1` FOREIGN KEY (`EMP_NO`) REFERENCES `medical_staff` (`EMP_NO`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `out_patient`
--
ALTER TABLE `out_patient`
  ADD CONSTRAINT `out_patient_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`NurseNo`) REFERENCES `nurse` (`EMP_NO`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_ibfk_2` FOREIGN KEY (`PrimaryDoctor_No`) REFERENCES `doctor` (`EMP_NO`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `patient_care_unit`
--
ALTER TABLE `patient_care_unit`
  ADD CONSTRAINT `patient_care_unit_ibfk_1` FOREIGN KEY (`Incharge_EmpNo`) REFERENCES `employee` (`EMP_NO`);

--
-- Constraints for table `patient_first_symptom`
--
ALTER TABLE `patient_first_symptom`
  ADD CONSTRAINT `patient_first_symptom_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `test_ibfk_1` FOREIGN KEY (`Treatment_ID`) REFERENCES `treatment` (`Treatment_ID`);

--
-- Constraints for table `vendor_supply_drug`
--
ALTER TABLE `vendor_supply_drug`
  ADD CONSTRAINT `vendor_supply_drug_ibfk_1` FOREIGN KEY (`VendorID`) REFERENCES `vendor` (`RegNo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vendor_supply_drug_ibfk_2` FOREIGN KEY (`DrugCode`) REFERENCES `drug` (`DrugCode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ward`
--
ALTER TABLE `ward`
  ADD CONSTRAINT `ward_ibfk_1` FOREIGN KEY (`PCUnit_No`) REFERENCES `patient_care_unit` (`PatientCareUnit_No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
