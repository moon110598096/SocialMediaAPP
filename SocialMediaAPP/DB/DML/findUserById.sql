CREATE procedure findUserById(
    IN p_userId varchar(15)
)
BEGIN
SELECT * FROM User
WHERE userId = p_userId;
END