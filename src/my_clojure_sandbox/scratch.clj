(ns scratch)



(def population2 {::zombies 2700 ::human 9})
;;(/ (pupulation ::zombies) (population ::human))
(def x 42)
(def myname "seungjin")

(defn print-down-from [x]
  (when (pos? x)
    (println x)
    (recur (dec x))))