CREATE PROCEDURE add_user (
    IN pUserID CHAR(10),
    IN pUserName CHAR(50),
    IN pEmail CHAR(100),
    IN pPassword CHAR(50),
    IN pBiography TEXT,
)
BEGIN
    INSERT INTO User(UserID, UserName, Email, Password, Biography)
    values (pUserID, pUserName, pEmail, pPassword, pBiography);
END


