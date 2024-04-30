use Stored procedure to post and get methods:

-- Add stock for Shift 1

DELIMITER $$

CREATE PROCEDURE AddStock_Shift1(material VARCHAR(50), quantity INT)

BEGIN

    INSERT INTO Shift1Stock (material, quantity) VALUES (material, quantity);
    
END$$

DELIMITER ;

******************************************************************************

-- Get stock for Shift 1

DELIMITER $$

CREATE PROCEDURE GetStock_Shift1(material_t VARCHAR(50))

BEGIN

    SELECT * FROM Shift1Stock WHERE material = material_t;
    
END$$

DELIMITER ;

*********************************************************************************

using trigger to get updates from shift tables

DELIMITER $$

CREATE TRIGGER UpdateStock_Shift1

AFTER UPDATE ON Shift1Stock

FOR EACH ROW

BEGIN
    INSERT INTO Shift1StockUpdates (material, old_quantity, new_quantity, update_timestamp)
    
    VALUES (OLD.material, OLD.quantity, NEW.quantity, NOW());
    
END$$

DELIMITER ;

**********************************************************************************

to create table for Shift1StockUpdates 

CREATE TABLE Shift1StockUpdates (
    id INT AUTO_INCREMENT PRIMARY KEY,
    material VARCHAR(50),
    old_quantity INT,
    new_quantity INT,
    update_timestamp TIMESTAMP
);

*********************************************************************************
