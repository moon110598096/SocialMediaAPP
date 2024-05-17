CREATE procedure findUserById(
    IN p_userId char(10)
)
BEGIN
SELECT * FROM User
WHERE userId = p_userId;
END