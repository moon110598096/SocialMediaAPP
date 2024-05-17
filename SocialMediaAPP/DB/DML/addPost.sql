CREATE procedure addPost (
    IN p_postId char(100),
    IN p_userId char(10),
    IN p_content TEXT
)
BEGIN
INSERT INTO Post(PostId, UserID, Content)
values (p_postId, p_userId, p_content);
END