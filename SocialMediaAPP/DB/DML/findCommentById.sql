CREATE procedure findCommentById(
    IN p_commentID char(100)
)
BEGIN
SELECT * FROM Comment
WHERE CommentID = p_commentID;
END