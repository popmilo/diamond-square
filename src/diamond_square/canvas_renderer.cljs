(ns diamond-square.canvas-renderer
  (:require [diamond-square.core :as core]))

(def canvas (.getElementById js/document "terrain"))
(def ctx (.getContext canvas "2d"))

(def colors
  ["#1437AD" "#04859D" "#007D1C" "#007D1C" "#24913C"
   "#00C12B" "#38E05D" "#A3A3A4" "#757575" "#FFFFFF"])

(defn img-terrain
  [m]
  (reduce
    (fn [rown row]
      (reduce
        (fn [coln tile]
          (set! (.-fillStyle ctx) (colors tile))
          (.fillRect ctx coln rown 1 1)
          #_(.setRGB img coln rown (colors tile))
          (inc coln))
        0 row)
      (inc rown))
    0 (core/normalize-terrain m (dec (count colors)))))

(img-terrain (core/terrain 9))