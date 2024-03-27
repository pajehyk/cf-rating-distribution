import React from 'react';
import Plot from 'react-plotly.js';

export default function RatingHistogram({xArg}) {
    return (
      <Plot
        data={[
          {
            type: 'histogram', 
            x: xArg,
            xbins: {
              end: 3700, 
              size: 100,
              start: 0
            }, 
            marker: {
              cmax: 1, 
              cmin: 0, 
              color: Array(12).fill(0)
              .concat(Array(2).fill(0.29))
              .concat(Array(2).fill(0.43))
              .concat(Array(2).fill(0.57))
              .concat(Array(2).fill(0.71))
              .concat(Array(4).fill(0.86))
              .concat(Array(30).fill(1)), 
              colorscale: [
                [0, 'rgb(120,120,120)'],
                [0.14, 'rgb(136,204,34)'], 
                [0.29, 'rgb(0,128,0)'], 
                [0.43, 'rgb(3,168,158)'], 
                [0.57, 'rgb(0,0,255)'], 
                [0.71, 'rgb(170,0,170)'], 
                [0.86, 'rgb(255,140,0)'], 
                [1, 'rgb(255,0,0)']
              ],
              line: {
                color: 'black',
                width: 0.1
              }
            }
          },
        ]}
        layout={ {width: 640, height: 480, title: `Rating Distribution`} }
      />
    );
}
