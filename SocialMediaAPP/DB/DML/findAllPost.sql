CREATE procedure findAllPost()
BEGIN
SELECT * FROM Post
WHERE removed = false;
END