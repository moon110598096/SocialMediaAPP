CREATE procedure findUserById(
    IN p_userId char(10)
)
BEGIN
SELECT * FROM User
WHERE UserID = p_userId;
END