CREATE procedure editPost(
    IN p_postId char(100),
    IN p_content TEXT
)
BEGIN
UPDATE Post
SET content = p_content
WHERE postId = p_postId;
END