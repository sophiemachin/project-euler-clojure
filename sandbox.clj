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
((fn [x] (zero? (mod x 3))) 16)

;; pass a collection to the function
((fn [x] (zero? (mod x 3))) (range 1 11))

(#(zero? (mod % 3)) 16)

(filter
 #(zero?
   (mod % 3))
 (range 1 11))


;; loop

(loop [x 10]
  (when (> x 1)
    (println x)
    (recur (- x 2))))

(loop []
 )