CREATE procedure deletePost(
    IN p_postId varchar(15)
)
BEGIN
UPDATE Post
SET removed = true
WHERE postId = p_postId;
END