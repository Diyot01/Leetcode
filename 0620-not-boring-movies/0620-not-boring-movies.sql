Select id, movie, description, rating from Cinema
Where description!="boring" and id%2!=0
Order By rating desc;