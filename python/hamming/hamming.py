from operator import ne

def distance(strand_a, strand_b):
    if (len(strand_a) != len(strand_b)):
        raise ValueError("Strands should have equal size")

    bitmap_distance = map(ne, strand_a, strand_b)
    return sum(bitmap_distance)