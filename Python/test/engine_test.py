#!/bin/env python
# -*- encoding: utf-8 -*-

from sqlalchemy.engine import create_engine
engine =  create_engine('sqlite:///:memory:',echo=True)
connection =  engine.connect()
connection.execute(
    """
    CREATE TABLE users (
        username VARCHAR PRIMARY KEY,
        password VARCHAR NOT NULL
    );
    """
)
connection.execute(
    """
    INSERT INTO users (username, password) VALUES (?, ?);
    """,
    "foo", "bar"
)
result = connection.execute("select username from users")
for row in result:
    print "username:",row['username']
connection.close()