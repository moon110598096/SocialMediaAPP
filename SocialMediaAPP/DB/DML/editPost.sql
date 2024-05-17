CREATE procedure editPost(
    IN p_postId char(100),
    IN p_content TEXT
)
BEGIN
UPDATE Post
SET Content = p_content
WHERE PostId = p_postId;
END