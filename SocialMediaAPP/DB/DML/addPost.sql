CREATE procedure addPost (
    IN p_postId varchar(15),
    IN p_userId varchar(20),
    IN p_content varchar(50)
)
BEGIN
INSERT INTO Post(postId, userId, content)
values (p_postId, p_userId, p_content);
END