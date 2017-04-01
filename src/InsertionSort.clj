(ns insertion-sort)

(def array-1 (vec (repeatedly 10 #(rand-int 20))))

(defn ins-sort
      [lhs-arr key]
      (concat (filter #(<= % key) lhs-arr)  [key] (filter #(> % key) lhs-arr)))


(defn insertion-sort
      [unsorted-vec]
      (loop [sorted-vec []
             unsorted-vec unsorted-vec]
            (if (empty? unsorted-vec)
              sorted-vec
              (recur (ins-sort sorted-vec (first unsorted-vec))(rest unsorted-vec))
              )
            )
      )

(println array-1)
(println(insertion-sort array-1))



