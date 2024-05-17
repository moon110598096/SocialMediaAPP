CREATE procedure editPost(
    IN p_postId varchar(15),
    IN p_content varchar(50)
)
BEGIN
UPDATE Post
SET content = p_content
WHERE postId = p_postId;
END