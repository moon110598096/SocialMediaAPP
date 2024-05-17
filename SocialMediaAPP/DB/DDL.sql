CREATE TABLE User (
    UserID CHAR(10) PRIMARY KEY,
    UserName CHAR(50),
    Email CHAR(100),
    Password CHAR(50),
    Biography TEXT
);

CREATE TABLE Post (
    PostID CHAR(100) PRIMARY KEY,
    UserID CHAR(10),
    Content TEXT,
    CreatedAt TIMESTAMP,
    Removed Boolean,
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE Comment (
    CommentID CHAR(20) PRIMARY KEY,
    UserID CHAR(10),
    PostID CHAR(100),
    Content TEXT,
    CreatedAt TIMESTAMP,
    FOREIGN KEY (UserID) REFERENCES User(UserID),
    FOREIGN KEY (PostID) REFERENCES Post(PostID)
);
