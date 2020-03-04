(ns p-p-p-pokerface)

(def high-seven                   ["2H" "3S" "4C" "5C" "7D"])
(def pair-hand                    ["2H" "2S" "4C" "5C" "7D"])
(def two-pairs-hand               ["2H" "2S" "4C" "4D" "7D"])
(def three-of-a-kind-hand         ["2H" "2S" "2C" "4D" "7D"])
(def four-of-a-kind-hand          ["2H" "2S" "2C" "2D" "7D"])
(def straight-hand                ["2H" "3S" "6C" "5D" "4D"])
(def low-ace-straight-hand        ["2H" "3S" "4C" "5D" "AD"])
(def high-ace-straight-hand       ["TH" "AS" "QC" "KD" "JD"])
(def flush-hand                   ["2H" "4H" "5H" "9H" "7H"])
(def full-house-hand              ["2H" "5D" "2D" "2C" "5S"])
(def straight-flush-hand          ["2H" "3H" "6H" "5H" "4H"])
(def low-ace-straight-flush-hand  ["2D" "3D" "4D" "5D" "AD"])
(def high-ace-straight-flush-hand ["TS" "AS" "QS" "KS" "JS"])

(defn rank 
  [card]
  (let [[rank _] card        
        rank_lookup {\T 10, \J 11, \Q 12, \K 13, \A 14}]    
    (if (Character/isDigit rank)      
      (Integer/valueOf (str rank))      
      (get rank_lookup rank))))


(defn suit 
  [card]
  (let [[_ suit] card]
    (str suit)))


(defn contains-kind?
  [hand kind]
  (let [ranks (map rank hand)
        rank-count (frequencies ranks)]
    (contains? (set (vals rank-count)) kind)))
  

(defn pair? 
  [hand]
  (contains-kind? hand 2))


(defn three-of-a-kind? 
  [hand]
  (contains-kind? hand 3))


(defn four-of-a-kind? 
  [hand]
  (contains-kind? hand 4))

(defn flush? [hand]
  nil)

(defn full-house? [hand]
  nil)

(defn two-pairs? [hand]
  nil)

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
