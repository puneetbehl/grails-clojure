(ns grails)

(defn simple []
    (str "A Simple Clojure Function"))

(defn fibo [cnt]
    (take cnt (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1]))))
    
(defn add_numbers ([x] x) 
    ([x & rest-args] (reduce + (cons x rest-args))))

(def fifteen 15)

(def x 42)

(def test_string "test string")

(defn execute_closure [closure a b]
    (closure a b))

(defn read_map [test-map key]
    (test-map key))
