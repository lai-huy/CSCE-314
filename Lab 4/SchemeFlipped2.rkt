#lang racket
(define (deeplistadder list1 list2)
  (cons
   (if (list? (car list1))
       (if (empty? (car list1))
           (map + list1 list2)
           (deeplistadder (car list1) (car list2))
       )
       (deeplistadder (car list1) (car list2))
   )
   (if (list? (cdr list1))
       (if (empty? (cdr list1))
           (map + list1 list2)
           (deeplistadder (cdr list1) (cdr list2))
       )
       (deeplistadder (cdr list1) (cdr list2))
    )
  )

  
  ;(cond
  ;  ((empty? (cdr list1)) (map + list1 list2))
  ;  ((list? (cdr list1)) (deeplistadder (cdr list1) (cdr list2)))
  ;  ((empty? (car list1)) (map + list1 list2))
  ;  ((list? (car list1)) (deeplistadder (car list1) (car list2)))
  ;  (else (map + (car list1) (car list2)))
  ;)
)

(define (main)
  ;(display (if #t (if #f "TT" "FF") (if #t "FT" "FF")))
  (display (deeplistadder '((1 2 (3 4)) 4) '((1 2 (3 4)) 6)))
  ;(display (map + '(1 2) '(2 3)))
)

(main)