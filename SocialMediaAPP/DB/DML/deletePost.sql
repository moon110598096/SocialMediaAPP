CREATE procedure deletePost(
    IN p_postId varchar(100)
)
BEGIN
UPDATE Post
SET removed = true
WHERE postId = p_postId;
END