(define (double-everything list) (* list 2))

(define (main)
  (display (map double-everything '()))
  (display "\n")
  (display (map double-everything '(1 2 3)))
  (display "\n")
)

(main)
(exit)
