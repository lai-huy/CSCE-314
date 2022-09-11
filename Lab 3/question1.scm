; Authors: Huy Lai, Elizabeth Knatcher, Nefemi Esan
; Class: CSCE 314
; Date: 2022 09 11

(define (listmaker n)
  (cond
   ((< n 0) '())
   ((equal? n 0) '())
   (else (append (listmaker (- n 1)) (cons (- n 1) '())))
  )
)

(define (main)
  (display (listmaker 0))
  (display "\n")
  (display (listmaker -4))
  (display "\n")
  (display (listmaker 2))
  (display "\n")
  (display (listmaker 5))
)

(main)
(exit)
