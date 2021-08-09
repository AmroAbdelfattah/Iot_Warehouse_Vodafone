CREATE TABLE `sim_card` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `country` varchar(255) DEFAULT NULL,
  `operator_code` int NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `device` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `status` varchar(255) DEFAULT NULL,
  `temp` int NOT NULL,
  `sim_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa0onp4f85e8v8af0bav43hbrh` (`sim_id`),
  CONSTRAINT `FKa0onp4f85e8v8af0bav43hbrh` FOREIGN KEY (`sim_id`) REFERENCES `sim_card` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
