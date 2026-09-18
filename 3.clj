;; The prime factors of 13195 are 5, 7, 13 and 29.

;; What is the largest prime factor of the number 600851475143?

(def target (/ 13196 2))

(println target)


(loop [x 1]
  (when (< x target)
    (println x)
    (recur (+ x 1))))




 (loop [x 1]
        (when (< x target)
          (println (mod target x))
          (recur (+ x 1))))




;;
;; (defn get-largest-factor [n]
;;   (loop [n 1]
;;     (when (< x n)
;;       ;;(println x)
;;       (mod n x))
;;     (recur (+ x 1))))

;; (get-largest-factor 10)

;;(map inc (range 1 5))