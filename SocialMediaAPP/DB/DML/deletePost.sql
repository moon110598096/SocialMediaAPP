CREATE procedure deletePost(
    IN p_postId char(100)
)
BEGIN
UPDATE Post
SET Removed = true
WHERE PostId = p_postId;
END