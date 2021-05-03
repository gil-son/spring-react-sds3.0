const DataTable = () => {
    const n = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

    return (

        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th> Data </th>
                        <th> Salesperson </th>
                        <th> Clients: </th>
                        <th> Closed deals </th>
                        <th> Value </th>
                    </tr>
                </thead>
                <tbody>
                    {
                        n.map(() => {
                            return (
                                <tr>
                                    <td>22/04/2021</td>
                                    <td>Barry Allen</td>
                                    <td>34</td>
                                    <td>25</td>
                                    <td>15017.00</td>
                                </tr>

                            )
                        })
                    }
                </tbody>
            </table>
        </div>
    );
}

export default DataTable;












