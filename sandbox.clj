;; loop
(dotimes [i 3]
  (println i))

;; mod
(mod 16 5)

;; if
(if (= 15 5)
  (println "true")
  (println "false"))


(if (= (mod 16 3) 0)
  (println "true")
  (println "false"))


;; define a variable (don't normally do this, its immutable)
(def total 0)


;; reduce - apply a function to a collection of values
(reduce + (range 10))
(reduce * (range 1 11))
(reduce * [2 3 4])

;; filter
(filter even? (range 10))
(filter #(zero? (mod % 3)) (range 10))

;; inc 
(inc 1)

;; map - apply function to each item in collection
(map inc (range 1 5))

;;map - passing collections in parallel
(map + [1 2 3] [4 5 6])
(map + [1 2 3] [4 5 6] [7 8 9])

(map println ["apple", "banana", "cherry"])

;; functions
(defn add [a b]
  (+ a b))

(add 3 4)

;; anonymous function
;; pass one item to the function
((fn [x] (+ x 1)) 3)
(#(+ % 1) 3)

;; more complex anonymous function
((fn [x] (zero? (mod x 3))) 16)
(#(zero? (mod % 3)) 16)


;; filter - anon function and coll
(filter #(even? %) [1 2 2 3 4 5 6 6])



;; loop
(loop [x 1]
  (when (< x 10)
    (println x)
    (recur (+ x 1))))


;; doseq
(#(doseq [x (range 1 11)]
    (println x)))


;; take - Returns a lazy sequence of the first n items in coll
(take 3 ["z" "y" "x" "w" "v" "u" "t" "s" "r" "q"])


;; iterate - infinite sequence of  x,   (f x),   (f (f x)) etc 
(take 4 (iterate inc 0))


;; apply and concat
(apply concat [[1 2] [3 4] [5 6]])

(apply + [1 2 3 4 ])


;; sort
(sort [3 1 4 2])

;; last
(last [1 2 3 4 5])