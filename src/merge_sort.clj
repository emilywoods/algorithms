(ns merge-sort)

(def initial-vec (vec (repeatedly 8 #(rand-int 20))))

(defn merge-vec
  [[rhs_first & rhs_rest :as RHS] [lhs_firs & lhs_rest :as LHS] sorted_vec]
  (if (or (empty? RHS) (empty? LHS))
    (concat sorted_vec RHS LHS)
    (if (<= rhs_first lhs_firs)
      (recur rhs_rest LHS (conj sorted_vec rhs_first))
      (recur RHS lhs_rest (conj sorted_vec lhs_firs)))))

(defn mergesort
  [unsorted-vec]
  (if ( > (count unsorted-vec) 1 )
    (let [split-vec (split-at (/ (count unsorted-vec) 2) unsorted-vec ) ]
    (merge-vec (mergesort  (first split-vec) ) (mergesort (second split-vec) ) [] ))
    unsorted-vec)
  )

(println initial-vec)
(time (println (mergesort initial-vec)))
