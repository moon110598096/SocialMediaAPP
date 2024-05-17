CREATE procedure findAllPost()
BEGIN
SELECT * FROM Post
WHERE Removed = false;
END