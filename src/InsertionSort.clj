(ns insertion-sort)

(def initial-vec (vec (repeatedly 10 #(rand-int 20))))

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

(println initial-vec)
(println(insertion-sort initial-vec))



