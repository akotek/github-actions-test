(ns github-actions-test.core
  (:require [clojure.java.jdbc :as j]))


(def db
  {:classname   "org.h2.Driver"
   :subprotocol "h2:mem"
   :subname     "demo;DB_CLOSE_DELAY=-1"
   :user        "sa"
   :password    ""})


(j/execute! db["create table gl (id int primary key, age int, gender varchar(100), coverage int,
monthly_ach double, monthly_cc double)"])
;
(j/execute! db ["insert into gl values
  (1, 50, 'male', 5000, 127.7, 129.5),
  (2, 50, 'male', 15000, 129.5, 130.5),
  (3, 50, 'male', 25000, 130.5, 140.6),
  (4, 50, 'female', 5000, 123,140)"])

 ;(j/query db ["select * from gl"])