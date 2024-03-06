# cook your dish here
def min_operations_to_unite(S):
    positions = {}
    for i, char in enumerate(S):
        if char not in positions:
            positions[char] = [i]
        else: 
            positions[char].append(i)
    min_operations = float('inf')
    for char, indices in positions.items():
        num_indices = len(indices)
        operations = sum(indices[j]-indices[j-1]-1 for j in range(1, num_indices))
        min_operations = min(min_operations, operations)
    return min_operations
T = int(input())
for _ in range(T):
    s=input()
    result=min_operations_to_unite(S)
    print(result)
