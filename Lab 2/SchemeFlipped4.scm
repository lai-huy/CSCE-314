; Author: Huy Lai, Nifemi Esan, Elizabeth Knatcher
; Date: 04 September 2022
; File: SchemeFlipped1.scm
; Class: CSCE 314

(define (fifteen-percent x)
  (* (/ 15 100) x)
)

(define (main)
  (display (fifteen-percent 100))
  (display "\n")
  (display (fifteen-percent 500))
  (display "\n")
)

(main)
(exit)
