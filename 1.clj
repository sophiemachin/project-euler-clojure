;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.


;; get integers
(range 1 1000)

;; get anything with a modulus of 0 using `zero?`
(filter #(zero? (mod % 3)) (range 1 1000))

;; add them
(apply + (filter #(zero? (mod % 3)) (range 1 1000)))

;; put into a function
(defn get-sum [den]
  (apply + (filter #(zero? (mod % den)) (range 1 1000)))
  )


(-
 (+
  (get-sum 3)
  (get-sum 5))
 (get-sum 15))