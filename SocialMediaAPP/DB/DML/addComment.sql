CREATE procedure addComment (
    IN p_commentID char(100),
    IN p_userID char(10),
    IN p_postID char(100),
    IN p_content TEXT
)
BEGIN
INSERT INTO Comment(CommentID, UserID, PostID, Content)
values (p_commentID, p_userID, p_postID, p_content);
END